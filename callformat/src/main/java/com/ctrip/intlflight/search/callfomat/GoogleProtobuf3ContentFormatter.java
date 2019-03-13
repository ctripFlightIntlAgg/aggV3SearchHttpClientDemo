package com.ctrip.intlflight.search.callfomat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tiantianhuang
 * @date 2019/3/6 16:29
 */
public abstract class GoogleProtobuf3ContentFormatter implements ContentFormatter {

    private final Logger logger = LoggerFactory.getLogger(GoogleProtobuf3ContentFormatter.class);
    private static final ConcurrentHashMap<Class, AbstractParser<Message>> parserMap = new ConcurrentHashMap<>();

    @Override
    public String getEncoding() {
        return "UTF-8";
    }

    @Override
    public <T> void serialize(OutputStream outputStream, T obj) throws IOException {
        if (!(obj instanceof Message)) {
            throw new IOException(obj.getClass().getName() + " can't be serialize");
        }
        Message message = (Message) obj;
        try (OutputStream outputs = getOutputStream(outputStream)) {
            message.writeTo(outputs);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <T> T deserialize(final Class<T> cls, InputStream inputStream) throws IOException {
        if (!GeneratedMessageV3.class.isAssignableFrom(cls)) {
            throw new IOException(cls.getName() + " can't be deserialize");
        }
        try (InputStream inputs = getInputStream(inputStream)) {
            AbstractParser<Message> abstractParser = parserMap.get(cls);
            if (abstractParser == null) {
                abstractParser = new AbstractParser<Message>() {
                    private volatile Constructor constructor;

                    @Override
                    public Message parsePartialFrom(CodedInputStream input,
                                                    ExtensionRegistryLite extensionRegistry)
                            throws InvalidProtocolBufferException {
                        try {
                            if (constructor == null) {
                                synchronized (this) {
                                    if (constructor == null) {
                                        constructor = cls.getDeclaredConstructor(
                                                CodedInputStream.class, ExtensionRegistryLite.class);
                                        constructor.setAccessible(true);
                                    }
                                }
                            }
                            return (Message) constructor.newInstance(input, extensionRegistry);
                        } catch (Exception e) {
                            throw new InvalidProtocolBufferException(e.getMessage());
                        }
                    }
                };
                parserMap.putIfAbsent(cls, abstractParser);
            }
            return (T) abstractParser.parseFrom(inputs);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new IOException(cls.getName() + " can't be deserialize");
        }
    }

    abstract OutputStream getOutputStream(OutputStream outputStream) throws IOException;

    abstract InputStream getInputStream(InputStream inputStream) throws IOException;
}
