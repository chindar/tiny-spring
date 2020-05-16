package com.chinda.tinyspring;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.factory.AutowireCapableBeanFactory;
import com.chinda.tinyspring.beans.factory.BeanFactory;
import org.junit.Test;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class BeanFactoryTest {

    @Test
    public void test() {

        // 1. 初始化beanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2. 注入Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.chinda.tinyspring.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3. 获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
