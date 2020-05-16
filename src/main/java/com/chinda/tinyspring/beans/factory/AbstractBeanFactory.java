package com.chinda.tinyspring.beans.factory;

import com.chinda.tinyspring.beans.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String, BeanDefinition> registry = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return registry.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        registry.put(name, beanDefinition);
    }

    /**
     * 初始化Bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
