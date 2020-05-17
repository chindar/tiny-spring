package com.chinda.tinyspring.aop;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * 获取切面
     * @return
     */
    Pointcut getPointcut();
}
