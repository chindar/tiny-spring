package com.chinda.tinyspring.beans;

import com.chinda.tinyspring.beans.io.ResourceLoader;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
@Getter
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private Map<String, BeanDefinition> registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }
}
