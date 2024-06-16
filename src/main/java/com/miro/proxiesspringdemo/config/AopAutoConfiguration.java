package com.miro.proxiesspringdemo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.Advice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
public class AopAutoConfiguration {
}



