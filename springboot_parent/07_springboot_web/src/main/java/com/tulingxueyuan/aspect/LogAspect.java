package com.tulingxueyuan.aspect;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    Logger log = LoggerFactory.getLogger(LogAspect.class);
    @Around("execution(* com.tulingxueyuan.controller.*.*(..)) && @annotation(apiOperation)")
    public Object around(ProceedingJoinPoint joinPoint, ApiOperation apiOperation) throws Throwable{
        StringBuilder loginfo = new StringBuilder("user access:");

        Class<?> controller = joinPoint.getThis().getClass();
        Api api = controller.getAnnotation(Api.class);

        if(api != null){
            loginfo.append(api.value());
        }
        String value = apiOperation.value();
        loginfo.append("------" + value);

        log.info(loginfo.toString());

        return joinPoint.proceed();
    }
}
