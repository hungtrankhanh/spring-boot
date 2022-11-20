package com.example.demo.aop;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
@AllArgsConstructor
@Log4j2
public class LogAspect {
//    final private Logger log;

    @Around("execution(* com.example.demo.func.*.*(..))")
    public void log1(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Start log1 for : " + joinPoint.getSignature().toString());
        var startTime = Instant.now();
        joinPoint.proceed();
        var endTime =  Instant.now();
        var elapseTime = Duration.between(startTime, endTime).toMillis();
        log.info("End log1 for : execution time = " + elapseTime);
    }

    @Before("execution(* com.example.demo.func.PlayMusic.*(..)) && args(..,isPlayed))")
    public void log2(JoinPoint joinPoint, boolean isPlayed) throws Exception {
        log.info("End log2 for : execution time = " + isPlayed);
        if (!isPlayed) {
            throw new Exception();
        }
    }
}
