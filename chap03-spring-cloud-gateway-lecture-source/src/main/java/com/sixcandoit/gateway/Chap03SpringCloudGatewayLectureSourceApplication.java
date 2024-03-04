package com.sixcandoit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap03SpringCloudGatewayLectureSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap03SpringCloudGatewayLectureSourceApplication.class, args);
	}

}
