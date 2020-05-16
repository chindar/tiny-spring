package com.chinda.tinyspring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanDefinition {
    private Object bean;
    private Class<? extends Object> beanClass;
    private String beanClassName;
    private PropertyValues propertyValues;

    @SneakyThrows
    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        this.beanClass = Class.forName(beanClassName);
    }
}
