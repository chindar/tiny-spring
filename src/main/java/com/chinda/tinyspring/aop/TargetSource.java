package com.chinda.tinyspring.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public class TargetSource {
    private Object target;
    private Class<? extends Object> targetClass;
}
