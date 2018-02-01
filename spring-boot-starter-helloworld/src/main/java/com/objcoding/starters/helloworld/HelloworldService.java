package com.objcoding.starters.helloworld;

/**
 * Created by chenghui.zhang on 2018/2/2.
 */
public class HelloworldService {

    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello, " + words;
    }
}
