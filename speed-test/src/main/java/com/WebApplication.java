package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nexio"})
@PropertySource({"application.properties", "undertow.properties"})
public class WebApplication {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 忽略非法反射警告  適用於jdk11
     */
    @SuppressWarnings({"unchecked","rawtypes"})
    public static void disableAccessWarnings() {
        try {
            Class unsafeClass = Class.forName("sun.misc.Unsafe");
            Field field = unsafeClass.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object unsafe = field.get(null);

            Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
            Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);

            Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field loggerField = loggerClass.getDeclaredField("logger");
            Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
            putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
        } catch (Exception ignored) {
        }
    }

    public static void main(String args[]) {
        disableAccessWarnings();
        //執行SpringApplication
        SpringApplication.run(WebApplication.class, args);

    }



}