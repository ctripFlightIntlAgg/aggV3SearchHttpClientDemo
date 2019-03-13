package com.ctrip.intlflight.search.callfomat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author tiantianhuang
 * @date 2019/3/6 16:29
 */
public interface ContentFormatter {
    String getContentType();

    String getExtension();

    String getEncoding();

    <T> void serialize(OutputStream var1, T var2) throws IOException;

    <T> T deserialize(Class<T> var1, InputStream var2) throws IOException;
}