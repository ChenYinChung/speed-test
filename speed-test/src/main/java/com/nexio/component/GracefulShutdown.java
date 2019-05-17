package com.nexio.component;

import io.undertow.Undertow;
import io.undertow.server.ConnectorStatistics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 优雅关闭 Spring Boot
 */
@Component
public class GracefulShutdown implements ApplicationListener<ContextClosedEvent> {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GracefulShutdownWrapper gracefulShutdownWrapper;
    @Autowired
    private ServletWebServerApplicationContext context;

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        gracefulShutdownWrapper.getGracefulShutdownHandler().shutdown();
        logger.info("Server graceful shutdown now");
        try {
            gracefulShutdownWrapper.getGracefulShutdownHandler().awaitShutdown();
        } catch (InterruptedException e) {
            logger.error("Server graceful shutdown failure",e);
        }
    }
}
