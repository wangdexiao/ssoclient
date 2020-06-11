package com.sso.democlient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/permission2").setViewName("permission");
        registry.addViewController("/permission").setViewName("permission");
        registry.addViewController("/auth").setViewName("auth");
        registry.addViewController("/").setViewName("index");//不需要权限
    }


//    @Bean
//    public OAuth2RestTemplate restTemplate(){
//        return new OAuth2RestTemplate();
//    }
}
