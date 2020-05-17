package com.chinda.tinyspring.aop;

import lombok.Data;
import org.aopalliance.aop.Advice;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
@Data
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private Advice advice;
    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

    public void setExpression(String expression) {
        this.pointcut.setExpression(expression);
    }

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public Advice getAdvice() {
        return this.advice;
    }
}
