package com.koutheirDemo.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.koutheirDemo.bootdemo.repositery.UserRepository;

@SpringBootApplication
public class DemoApplication {
	@Autowired 
	 UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
