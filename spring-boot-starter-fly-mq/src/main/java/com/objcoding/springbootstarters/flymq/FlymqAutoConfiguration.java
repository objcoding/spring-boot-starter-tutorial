package com.objcoding.springbootstarters.flymq;

import com.objcoding.flymq.utils.JedisManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenghui.zhang on 2018/1/31.
 */
@Configuration
@ConditionalOnClass(JedisManager.class)
@EnableConfigurationProperties(FlymqProperties.class)
public class FlymqAutoConfiguration {

    public FlymqAutoConfiguration(FlymqProperties flymqProperties) {
        System.out.println("====== 初始化连接池 =======");
        JedisManager.initPool(flymqProperties);
    }
}
