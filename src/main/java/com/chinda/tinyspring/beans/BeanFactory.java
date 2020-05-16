package com.chinda.tinyspring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class BeanFactory {
    private Map<String, BeanDefinition> registry = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return registry.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        registry.put(name, beanDefinition);
    }
}
