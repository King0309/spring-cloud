package com.king.s.cloud.e.client.a.config;

import com.king.s.cloud.e.client.a.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class HandleConfig extends WebMvcConfigurationSupport {

    @Bean
    public AuthInterceptor getAuthInterceptor(){
        return new AuthInterceptor();
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getAuthInterceptor()).excludePathPatterns();
    }
}
