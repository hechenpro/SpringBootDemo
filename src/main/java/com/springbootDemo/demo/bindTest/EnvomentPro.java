package com.springbootDemo.demo.bindTest;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author
 * @version 1.0
 * @date 2020/11/16 19:35
 * @desc TODO
 */
@Component
public class EnvomentPro implements EnvironmentAware{

    private Definition definition;
    private MultiKafkaProperties multiKafkaProperties;
    /**
     * @Desc
     * @author test
     * @Date 9:28 2020/11/24
     **/
   @Override
    public void setEnvironment(Environment environment) {
        Binder binder = Binder.get(environment);
       //匹配yml文件的内容
        definition = binder.bind("district", Bindable.of(Definition.class)).get();
        //匹配properties文件的具体的某一属性的内容
       //Map map = binder.bind("kafka.producer", Map.class).get();
        //匹配properties文件的内容
       multiKafkaProperties = binder.bind("kafka", Bindable.of(MultiKafkaProperties.class)).get();
    }
}
