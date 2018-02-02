package com.lza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class ShopGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopGatewayApplication.class, args);
	}
}
