package com.chinda.tinyspring.aop;

import java.lang.reflect.Method;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public interface MethodMatcher {
    /**
     * 方法匹配
     *
     * @param method
     * @param targetClass
     * @return
     */
    boolean matches(Method method, Class<? extends Object> targetClass);
}
