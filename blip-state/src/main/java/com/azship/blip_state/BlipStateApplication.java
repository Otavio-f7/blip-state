package com.azship.blip_state;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class BlipStateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlipStateApplication.class, args);
	}

}
