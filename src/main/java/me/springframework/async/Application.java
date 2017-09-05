package me.springframework.async;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.springframework.async.service.Service;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private Service service;

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Future<String> result = service.execute();
		LOG.info("Phew Phew Phew");
		LOG.info("Thread id = " + result.get());
		LOG.info("Done");
	}

}
