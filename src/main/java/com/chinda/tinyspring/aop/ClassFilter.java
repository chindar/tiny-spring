package com.chinda.tinyspring.aop;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public interface ClassFilter {
    /**
     * 类匹配
     * @param targetClass
     * @return
     */
    boolean matches(Class<? extends Object> targetClass);
}
