package com.sso.democlient.config;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import java.util.Iterator;
import java.util.Map;

@Slf4j
@Component
public class AppAware implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Filter> beansOfType = applicationContext.getBeansOfType(Filter.class);
        Iterator<String> iterator = beansOfType.keySet().iterator();
        while (iterator.hasNext()){
            String beanName = iterator.next();
            log.error("beanName: " + beanName);
        }
    }
}
