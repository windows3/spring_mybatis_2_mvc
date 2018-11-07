package com.windows3.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by 3 on 2018/3/8.
 * ----------------The heart withered--------
 */
@Aspect
public class LoggingAspect {
    @Around(value = "execution(* com.windows3.dao.*(..))")
    public  Object  aroundLogging(){
        return  null;
    }
}
