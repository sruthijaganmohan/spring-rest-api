package com.sruthi.content_calendar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sruthi.content_calendar.model.Content;
import com.sruthi.content_calendar.model.Status;
import com.sruthi.content_calendar.model.Type;
import com.sruthi.content_calendar.repository.ContentRepository;
import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(null, "Spring REST API", "Spring Boot Course", Status.IDEA, Type.VIDEO, LocalDateTime.now(), null, "");
			repository.save(content);
		};
	}

}
