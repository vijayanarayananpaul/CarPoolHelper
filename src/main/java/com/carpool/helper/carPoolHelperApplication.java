package com.carpool.helper;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.carpool.beans.WebContextConfiguration;

@Configuration
@EnableAutoConfiguration
/* @ComponentScan */
@ComponentScan({ "com.carpool.controller", "com.carpool.helper",
		"com.carpool.beans" })
public class carPoolHelperApplication  {
	
public void addResourceHandlers(ResourceHandlerRegistry registry) {
System.out.println("Same here too");
		
		if (!registry.hasMappingForPattern("/webjars/**")) {
			registry.addResourceHandler("/webjars/**").addResourceLocations(
					"classpath:/META-INF/resources/webjars/");
			
		registry.addResourceHandler("/css/**").addResourceLocations(
				"/css/");
		}
		if (!registry.hasMappingForPattern("/**")) {
			registry.addResourceHandler("/**").addResourceLocations(
					"/resources/public");
			
		registry.addResourceHandler("/css/**").addResourceLocations(
				"/css/");
		}
		
	}
	/*
	 * @Override protected final SpringApplicationBuilder configure(final
	 * SpringApplicationBuilder application) { return
	 * application.sources(carPoolHelperApplication.class); }
	 */
/*
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext
				.register(WebContextConfiguration.class);
		System.out
				.println("----------------------- Yes I am read here -----------------------");
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"SpringDispatcher", new DispatcherServlet(
						annotationConfigWebApplicationContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}*/

	public static void main(String[] args) {
		SpringApplication.run(carPoolHelperApplication.class, args);
		System.out.println("CarPool Application Started");
	}

	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("I came here");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
