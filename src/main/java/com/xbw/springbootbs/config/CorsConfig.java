package com.xbw.springbootbs.config;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    private static final long MAX_AGE = 24 * 60 * 60;

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");//设置访问地址
        corsConfiguration.addAllowedHeader("*");//这是访问原请求头
        corsConfiguration.addAllowedMethod("*");//设置访问源头请求方法
        corsConfiguration.setMaxAge(MAX_AGE);
        source.registerCorsConfiguration("/**",corsConfiguration);//对接口进行跨域设置
        return new CorsFilter(source);
    }
}
