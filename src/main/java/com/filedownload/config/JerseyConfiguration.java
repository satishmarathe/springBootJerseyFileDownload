package com.filedownload.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.filedownload.controller.BookController;

@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig{
	public JerseyConfiguration() {
		System.out.println("<<<<< inside constructor >>>>>>");
	}
	
	@PostConstruct
	public void setUp() {
		/** need to register the classes to whom the servlet will delegate the request processing **/
		System.out.println("<<<<< inside setup registering controller classes >>>>>>");
		register(BookController.class);
	}
}
