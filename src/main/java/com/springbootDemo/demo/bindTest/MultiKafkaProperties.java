package com.springbootDemo.demo.bindTest;

import java.util.Map;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2020/11/17 16:05
 * @desc TODO
 */
public class MultiKafkaProperties {
    private Map<String, Object> producer;
    private Map<String, Object> consumer;

    public Map<String, Object> getProducer() {
        return producer;
    }

    public void setProducer(Map<String, Object> producer) {
        this.producer = producer;
    }

    public Map<String, Object> getConsumer() {
        return consumer;
    }

    public void setConsumer(Map<String, Object> consumer) {
        this.consumer = consumer;
    }
}
