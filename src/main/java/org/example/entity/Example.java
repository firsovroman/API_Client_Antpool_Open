package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class Example {

    private Integer code;
    private String message;
    private Data data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param code
     * @param data
     * @param message
     */
    public Example(Integer code, String message, Data data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Example{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}