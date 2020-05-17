package com.chinda.tinyspring.context;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public interface ApplicationContext {
    /**
     * 获取Bean
     * @param name
     * @return
     */
    Object getBean(String name);
}
