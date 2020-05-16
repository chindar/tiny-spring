package com.chinda.tinyspring.beans;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public interface BeanDefinitionReader {
    /**
     * 加载xml配置文件
     * @param location
     */
    void loadBeanDefinitions(String location);
}
