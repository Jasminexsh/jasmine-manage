package com.jasmine.util.serialize;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.jasmine.util.LoggerUtil;
import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author xieshanghan
 * @version HessianSerializationUtil.java v 0.1, 2024/2/1 xieshanghan
 */
public class HessianSerializationUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(HessianSerializationUtil.class);

    public static <T> byte[] writeObj(T obj) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Hessian2Output hessian2Output = new Hessian2Output();
            hessian2Output.writeObject(obj);
            return baos.toByteArray();
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
            return null;
        }
    }

    public static <T> T readObj(byte[] bytes) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            Hessian2Input hessian2Input = new Hessian2Input(bais);
            return (T) hessian2Input.readObject();
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
            return null;
        }
    }

}