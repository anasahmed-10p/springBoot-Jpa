package com.example.simpleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.simpleProject.repositries.UserRepositery;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepositery.class)
public class SimpleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProjectApplication.class, args);
	}

}
