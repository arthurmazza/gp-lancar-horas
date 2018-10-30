package br.com.mitrotecnologia.gplancarhoras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpLancarHorasApplication implements CommandLineRunner {

	@Autowired
	private  Runner runner;
	
	public static void main(String[] args) {
		SpringApplication.run(GpLancarHorasApplication.class, args);
	}

	@Override
	public void run (final String... args) {
		runner.run();
	}
}
