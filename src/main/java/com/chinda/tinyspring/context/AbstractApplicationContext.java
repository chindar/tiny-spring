package com.chinda.tinyspring.context;

import com.chinda.tinyspring.beans.factory.AbstractBeanFactory;
import lombok.AllArgsConstructor;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@AllArgsConstructor
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public abstract void refresh();

    @Override
    public Object getBean(String name) {
        return beanFactory.getBean(name);
    }
}
