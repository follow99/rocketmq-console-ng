package org.apache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class RocketmqConsoleNgApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketmqConsoleNgApplication.class, args);
	}
}
