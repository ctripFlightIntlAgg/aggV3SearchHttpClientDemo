package com.ctrip.intlflight.search.callfomat;

import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author zwyu
 * @date 2019/01/03
 */
public class ZstdGoogleProtobuf3ContentFormatter extends GoogleProtobuf3ContentFormatter {
    public static final ZstdGoogleProtobuf3ContentFormatter INSTANCE = new ZstdGoogleProtobuf3ContentFormatter();

    private ZstdGoogleProtobuf3ContentFormatter() {

    }

    @Override
    OutputStream getOutputStream(OutputStream outputStream) throws IOException {
        return new ZstdOutputStream(outputStream);
    }

    @Override
    InputStream getInputStream(InputStream inputStream) throws IOException {
        return new ZstdInputStream(inputStream);
    }

    @Override
    public String getContentType() {
        return "application/zstd-protobuf-3";
    }

    @Override
    public String getExtension() {
        return "zstd-protobuf-3";
    }
}
