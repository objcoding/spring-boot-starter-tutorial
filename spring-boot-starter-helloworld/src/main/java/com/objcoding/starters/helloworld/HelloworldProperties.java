package com.objcoding.starters.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by chenghui.zhang on 2018/2/2.
 */
@ConfigurationProperties(prefix = "helloworld")
public class HelloworldProperties {
    public static final String DEFAULT_WORDS = "world";

    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
