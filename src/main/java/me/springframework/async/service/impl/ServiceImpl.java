package me.springframework.async.service.impl;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import me.springframework.async.service.Service;

@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {
	
	private static final Logger LOG = LoggerFactory.getLogger(ServiceImpl.class);

	@Async
	@Override
	public Future<String> execute() throws InterruptedException {
		LOG.info("Async method has been started . . . . . ");
		Thread.sleep(5000);
		LOG.info("Immediately stopping async method . . . . . ");
		return new AsyncResult<String>(String.valueOf(Thread.currentThread().getId()));
	}

}
