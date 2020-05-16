package com.chinda.tinyspring;

import lombok.Data;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Data
public class HelloWorldService {
    private String text;
    public void helloWorld() {
        System.out.println(text);
    }
}
