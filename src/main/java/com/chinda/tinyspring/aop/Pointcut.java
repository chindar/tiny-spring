package com.chinda.tinyspring.aop;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public interface Pointcut {

    /**
     * 获取类过滤器
     * @return
     */
    ClassFilter getClassFilter();

    /**
     * 获取方法匹配器
     * @return
     */
    MethodMatcher getMethodMatcher();
}
