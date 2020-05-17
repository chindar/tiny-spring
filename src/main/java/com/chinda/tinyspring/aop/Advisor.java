package com.chinda.tinyspring.aop;

import org.aopalliance.aop.Advice;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public interface Advisor {

    /**
     * 获取通知
     * @return
     */
    Advice getAdvice();
}
