package com.objcoding.starters.flymq;

import com.objcoding.flymq.config.RedisConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis配置类
 *
 * Created by chenghui.zhang on 2018/02/01.
 */
@ConfigurationProperties(prefix = "flymq")
public class FlymqProperties extends RedisConfig {

}
