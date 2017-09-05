package me.springframework.async.service;

import java.util.concurrent.Future;

public interface Service {
	
	Future<String> execute() throws InterruptedException;

}
