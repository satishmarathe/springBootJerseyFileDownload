package com.filedownload.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig{
	public JerseyConfiguration() {
		
	}
	
	@PostConstruct
	public void setUp() {
		/** need to register the classes to whom the servlet will delegate the request processing **/
	}
}
