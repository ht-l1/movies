// Package Declaration
package dev.hannah.movies;

// Imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Class Definition
@SpringBootApplication
@RestController
public class MoviesApplication {

	// Main Method: The entry point of the application
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// Controller Method: Handles HTTP GET requests
	@GetMapping("/root")
	public String apiRoot() {
		return "Hello World!";
	}
}
