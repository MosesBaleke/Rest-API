package com.example.demo;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			Address address = new Address("USA","Germantown","20874");
			Student student = new Student("Moses",
					"Baltke","Morey@hoge.com",Gender.MALE,address, List.of("Computer Science"), BigDecimal.TEN, LocalDateTime.now());
			repository.insert(student);
		};
	}
}
