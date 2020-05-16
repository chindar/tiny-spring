package com.chinda.tinyspring.beans.factory;

import com.chinda.tinyspring.beans.BeanDefinition;
import lombok.SneakyThrows;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @SneakyThrows
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        return beanDefinition.getBeanClass().newInstance();
    }
}
