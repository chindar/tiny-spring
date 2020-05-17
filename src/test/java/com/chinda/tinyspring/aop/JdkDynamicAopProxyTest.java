package com.chinda.tinyspring.aop;

import com.chinda.tinyspring.HelloWorldService;
import com.chinda.tinyspring.context.ApplicationContext;
import com.chinda.tinyspring.context.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author Wang Chinda
 * @date 2020/5/17
 * @see
 * @since 1.0
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() {
        System.out.println("-------------------------------IOC--------------------------------");
        // IOC获取Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();


        System.out.println("-------------------------------AOP--------------------------------");
        // 0. 封装代理相关的元数据
        AdvisedSupport advisedSupport = new AdvisedSupport();

        // 1. 设置被代理对象(连接点Joinpoint)
        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldService.class);
        advisedSupport.setTargetSource(targetSource);

        // 2. 设置拦截器(通知Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3. 构建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();
        helloWorldServiceProxy.helloWorld();
    }
}
