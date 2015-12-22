package com.carpool.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableAutoConfiguration
/*@ComponentScan*/
@ComponentScan({"com.carpool.controller","com.carpool.helper","com.carpool.beans"})
public class carPoolHelperApplication extends SpringBootServletInitializer{
	 /*@Override
	    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
	        return application.sources(carPoolHelperApplication.class);
	    }*/
    public static void main(String[] args) {
        SpringApplication.run(carPoolHelperApplication.class, args);
        System.out.println("CarPool Application Started");
    }
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
