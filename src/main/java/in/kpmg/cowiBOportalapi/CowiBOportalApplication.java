package in.kpmg.cowiBOportalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CowiBOportalApplication {

	@GetMapping("/message")
	public String getMsg() {
		
		return "Welcome! deployment";
	}
	public static void main(String[] args) {
		SpringApplication.run(CowiBOportalApplication.class, args);
	}

}
