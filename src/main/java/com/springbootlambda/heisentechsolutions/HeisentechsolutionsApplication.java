package com.springbootlambda.heisentechsolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.springbootlambda.heisentechsolutions.controller.ProfileController;

@SpringBootApplication
@Import({ ProfileController.class })
public class HeisentechsolutionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeisentechsolutionsApplication.class, args);
	}

}
