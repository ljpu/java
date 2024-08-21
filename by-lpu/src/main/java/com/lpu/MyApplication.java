package com.lpu;
import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.DefaultManagedTaskExecutor;

@SpringBootApplication
@EnableAsync
public class MyApplication implements AsyncConfigurer 
{     

    public static void main(String[] args) 
    {
        SpringApplication.run(MyApplication.class, args);
    } 

    @Bean(name = "CICSEnabledTaskExecutor") 
    public Executor getAsyncExecutor() 
    { 
        return new DefaultManagedTaskExecutor();
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() 
    {
        return new CustomAsyncExceptionHandler();
    }

} 

