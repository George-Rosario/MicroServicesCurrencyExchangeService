
package com.ey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceClientApplication.class, args);
	}
	
	/*@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}*/
}
