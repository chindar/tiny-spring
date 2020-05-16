package com.chinda.tinyspring.beans.factory;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.BeanReference;
import com.chinda.tinyspring.beans.PropertyValue;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

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
        Object bean = createBeanInstance(beanDefinition);
        beanDefinition.setBean(bean);
        // 填充属性
        applyPropertyValue(bean, beanDefinition);
        return bean;
    }

    private Object createBeanInstance(BeanDefinition beanDefinition) throws InstantiationException, IllegalAccessException {
        return beanDefinition.getBeanClass().newInstance();
    }

    @SneakyThrows
    private void applyPropertyValue(Object bean, BeanDefinition beanDefinition) {
        for (PropertyValue propertyValue: beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            declaredField.set(bean, value);
        }
    }
}
