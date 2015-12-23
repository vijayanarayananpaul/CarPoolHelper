package com.carpool.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvc
@ComponentScan({"com.carpool.controller","com.carpool.helper","com.carpool.beans"})
public class WebContextConfiguration {
	/*public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		if (!registry.hasMappingForPattern("/webjars/**")) {
			registry.addResourceHandler("/webjars/**").addResourceLocations(
					"classpath:/META-INF/resources/webjars/");
		}
		if (!registry.hasMappingForPattern("/**")) {
			registry.addResourceHandler("/**").addResourceLocations(
					"/resources/public");
		}
			
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
	}*/
}
