package com.chinda.tinyspring;

import com.chinda.tinyspring.beans.BeanPostProcessor;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public class BeanInitializeLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Initialize bean " + beanName + " start!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Initialize bean " + beanName + " end!");
        return bean;
    }
}
