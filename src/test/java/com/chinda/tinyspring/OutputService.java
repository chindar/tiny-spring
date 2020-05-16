package com.chinda.tinyspring;

import lombok.Setter;
import org.junit.Assert;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Setter
public class OutputService {
    private HelloWorldService helloWorldService;
    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }
}
