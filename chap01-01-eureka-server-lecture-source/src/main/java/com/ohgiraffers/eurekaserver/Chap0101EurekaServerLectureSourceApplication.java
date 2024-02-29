package com.ohgiraffers.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Chap0101EurekaServerLectureSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap0101EurekaServerLectureSourceApplication.class, args);
	}

}
