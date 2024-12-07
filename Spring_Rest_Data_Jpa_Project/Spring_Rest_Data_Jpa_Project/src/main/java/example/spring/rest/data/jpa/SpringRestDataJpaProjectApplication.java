package example.spring.rest.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "Book_library")
@EnableJpaRepositories(basePackages = "Book_library")
@EntityScan(basePackages = "Book_library")
public class SpringRestDataJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaProjectApplication.class, args);
	}

}
