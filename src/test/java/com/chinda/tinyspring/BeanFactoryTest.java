package com.chinda.tinyspring;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.factory.AutowireCapableBeanFactory;
import com.chinda.tinyspring.beans.factory.BeanFactory;
import com.chinda.tinyspring.beans.io.ResourceLoader;
import com.chinda.tinyspring.beans.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class BeanFactoryTest {

    @Test
    public void testLazy() {

        // 1. 读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        // 2. 初始化beanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 3. 注入Bean
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 4. 获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

    @Test
    public void testPreInstantiate() {

        // 1. 读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        // 2. 初始化beanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 3. 注入Bean
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 4. 预初始化Bean
        beanFactory.preInstantiateSingletons();

        // 5. 获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
