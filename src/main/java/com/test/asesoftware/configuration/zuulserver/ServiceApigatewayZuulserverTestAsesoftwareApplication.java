package com.test.asesoftware.configuration.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ServiceApigatewayZuulserverTestAsesoftwareApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceApigatewayZuulserverTestAsesoftwareApplication.class, args);
	}
}
