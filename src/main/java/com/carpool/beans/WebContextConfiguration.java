package com.carpool.beans;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebContextConfiguration extends WebMvcAutoConfigurationAdapter {
	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("View Resolver Loaded");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("Resource Handler triggered");

		if (!registry.hasMappingForPattern("/webjars/**")) {
			registry.addResourceHandler("/webjars/**").addResourceLocations(
					"classpath:/META-INF/resources/webjars/");

			registry.addResourceHandler("/resources/**")
					.addResourceLocations("/resources/");
		}
		if (!registry.hasMappingForPattern("/**")) {
			registry.addResourceHandler("/**").addResourceLocations(
					"/resources/public");

			registry.addResourceHandler("/resources/**")
					.addResourceLocations("/resources/");
		}

	}

	/*
	 * public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 * 
	 * if (!registry.hasMappingForPattern("/webjars/**")) {
	 * registry.addResourceHandler("/webjars/**").addResourceLocations(
	 * "classpath:/META-INF/resources/webjars/"); } if
	 * (!registry.hasMappingForPattern("/**")) {
	 * registry.addResourceHandler("/**").addResourceLocations(
	 * "/resources/public"); }
	 * 
	 * registry.addResourceHandler("/resources/**").addResourceLocations(
	 * "/resources/"); }
	 */
}
