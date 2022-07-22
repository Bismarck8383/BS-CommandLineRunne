package com.bosonit.LineRunne.CommandLineRunne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ejecutame();
	}
	@Bean
	 CommandLineRunner ejecutame() {
		return p -> {
			System.out.println("Linea a ejecutar cuando arranque");
		};

	}
}
