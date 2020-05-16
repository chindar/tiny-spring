package com.chinda.tinyspring;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.PropertyValue;
import com.chinda.tinyspring.beans.PropertyValues;
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

        // 2. Bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.chinda.tinyspring.HelloWorldService");

        // 3. 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4. 注入Bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 5. 获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
