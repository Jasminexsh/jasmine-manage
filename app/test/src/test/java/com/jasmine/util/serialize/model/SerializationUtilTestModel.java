package com.jasmine.util.serialize.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xieshanghan
 * @version SerializationUtilTestModel.java v 0.1, 2024/2/3 xieshanghan
 */
public class SerializationUtilTestModel implements Serializable {

    private static final long serialVersionUID = 6911062950949563622L;

    private String name;

    private String type;

    private Map<String, Object> properties;

    public SerializationUtilTestModel() {

    }

    public SerializationUtilTestModel(String name, String type, Map<String, Object> properties) {
        this.name = name;
        this.type = type;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SerializationUtilTestModel{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", properties=" + properties +
                '}';
    }

}