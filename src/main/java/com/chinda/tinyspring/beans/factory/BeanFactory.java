package com.chinda.tinyspring.beans.factory;

import com.chinda.tinyspring.beans.BeanDefinition;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public interface BeanFactory {

    /**
     * 获取Bean
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 注入Bean
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
