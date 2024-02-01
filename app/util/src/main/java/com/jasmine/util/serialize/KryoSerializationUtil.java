package com.jasmine.util.serialize;

import com.esotericsoftware.kryo.kryo5.Kryo;
import com.esotericsoftware.kryo.kryo5.io.Input;
import com.esotericsoftware.kryo.kryo5.io.Output;
import com.jasmine.util.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author xieshanghan
 * @version KryoSerializationUtil.java v 0.1, 2024/2/1 xieshanghan
 */
public class KryoSerializationUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(KryoSerializationUtil.class);

    private static Kryo singletonKryo;

    static {
        singletonKryo = new Kryo();
        singletonKryo.setReferences(true);
        singletonKryo.setRegistrationRequired(false);
    }

    public static <T> void writeFileObj(T obj) {
        try {
            Output output = new Output();
            singletonKryo.writeObject(output, obj);
            output.close();
            output.flush();
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
        }
    }

    public static <T> void writeFileObj(T obj, String filePath) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
            Output output = new Output(bos);
            singletonKryo.writeObject(output, obj);
            output.close();
            output.flush();
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
        }
    }

    public static <T> T readObj(byte[] bytes) {
        try {
            Input input = new Input(bytes);
            Object instance = singletonKryo.readClassAndObject(input);
            input.close();
            return (T) instance;
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
            return null;
        }
    }

    public static <T> T readObj(byte[] bytes, Class<T> claZz) {
        try {
            Input input = new Input(bytes);
            T instance = singletonKryo.readObject(input, claZz);
            input.close();
            return instance;
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
            return null;
        }
    }

    public static <T> T readFileObj(Class<T> claZz, String filePath) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
            Input input = new Input(bis);
            T instance = singletonKryo.readObject(input, claZz);
            input.close();
            return instance;
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, "");
            return null;
        }
    }

}