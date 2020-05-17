package com.chinda.tinyspring.beans.factory;

import com.chinda.tinyspring.beans.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String, BeanDefinition> registry            = new ConcurrentHashMap<>();
    private List<String>                beanDefinitionNames = new ArrayList<>();

    @Override
    public Object getBean(String name) {
        BeanDefinition beanDefinition = registry.get(name);
        if (null == beanDefinition) {
            throw new IllegalArgumentException("No bean named " + name + " is defined");
        }
        Object bean = beanDefinition.getBean();
        if (null == bean) {
            bean = doCreateBean(beanDefinition);
        }
        return bean;
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        registry.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }

    @Override
    public void preInstantiateSingletons() {
        for (Iterator<? extends String> it = this.beanDefinitionNames.iterator(); it.hasNext();) {
            String beanName = it.next();
            getBean(beanName);
        }
    }

    /**
     * 初始化Bean
     *
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
