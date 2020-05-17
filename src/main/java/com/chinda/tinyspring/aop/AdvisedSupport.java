package com.chinda.tinyspring.aop;

import lombok.Data;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
@Data
public class AdvisedSupport {
    private TargetSource      targetSource;
    private MethodInterceptor methodInterceptor;
}
