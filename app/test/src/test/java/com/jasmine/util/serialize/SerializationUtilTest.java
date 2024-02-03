package com.jasmine.util.serialize;

import com.google.common.collect.Maps;
import com.jasmine.util.serialize.model.SerializationUtilTestModel;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xieshanghan
 * @version SerializationUtilTest.java v 0.1, 2024/2/3 xieshanghan
 */
public class SerializationUtilTest {

    private SerializationUtilTestModel serializationUtilTestModel;

    @Before
    public void dataProcess() {
        serializationUtilTestModel = new SerializationUtilTestModel();
        serializationUtilTestModel.setName(serializationUtilTestModel.getClass().getName());
        serializationUtilTestModel.setType(serializationUtilTestModel.getClass().getTypeName());
        serializationUtilTestModel.setProperties(Maps.newHashMap());
    }

    @Test
    public void testWriteObj() {
        long t1 = System.currentTimeMillis();
        KryoSerializationUtil.writeObj(serializationUtilTestModel);
        long t2 = System.currentTimeMillis();
        System.out.println("kryo serialization time cost:" + (t2 - t1) + "ms");

        long t3 = System.currentTimeMillis();
        HessianSerializationUtil.writeObj(serializationUtilTestModel);
        long t4 = System.currentTimeMillis();
        System.out.println("hessian serialization time cost:" + (t4 - t3) + "ms");
    }

}