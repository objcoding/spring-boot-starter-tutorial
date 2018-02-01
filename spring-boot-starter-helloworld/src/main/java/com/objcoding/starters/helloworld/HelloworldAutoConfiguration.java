package com.objcoding.starters.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenghui.zhang on 2018/2/2.
 */
@Configuration
@ConditionalOnClass({HelloworldService.class}) // 当HelloworldService在类路径的条件下
@EnableConfigurationProperties(HelloworldProperties.class) // 将application.properties的相关的属性字段与该类一一对应，并生成Bean
public class HelloworldAutoConfiguration {

    // 注入属性类
    @Autowired
    private HelloworldProperties hellowordProperties;

    @Bean
    // 当容器没有这个Bean的时候才创建这个Bean
    @ConditionalOnMissingBean(HelloworldService.class)
    public HelloworldService helloworldService() {
        HelloworldService helloworldService = new HelloworldService();
        helloworldService.setWords(hellowordProperties.getWords());
        return helloworldService;
    }
}
