package com.lpu;
import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

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

class CustomAsyncExceptionHandler implements AsyncUncaughtExceptionHandler 
{
    public void handleUncaughtException(Throwable throwable, Method method, Object... obj) 
    {
        System.out.println("Exception Cause - " + throwable.getMessage());
        System.out.println("Method name - " + method.getName()); 
        for (Object param : obj) 
        {
            System.out.println("Parameter value - " + param);
        } 
    }
}