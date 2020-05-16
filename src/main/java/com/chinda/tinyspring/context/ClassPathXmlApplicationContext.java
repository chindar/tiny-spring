package com.chinda.tinyspring.context;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.factory.AbstractBeanFactory;
import com.chinda.tinyspring.beans.factory.AutowireCapableBeanFactory;
import com.chinda.tinyspring.beans.io.ResourceLoader;
import com.chinda.tinyspring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) {
        this(configLocation, new AutowireCapableBeanFactory());
    }


    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() {
        // 读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);

        // 注入Bean
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
