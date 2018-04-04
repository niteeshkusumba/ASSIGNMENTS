package springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
public class CourseApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);
	}

}
