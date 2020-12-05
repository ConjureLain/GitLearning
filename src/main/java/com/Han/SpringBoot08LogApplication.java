package com.Han;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot08LogApplication {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringBoot08LogApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBoot08LogApplication.class, args);
	}
	
	//依赖注入完成之后就会执行@postConstructor方法
	@PostConstruct
	public void myLog() {
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.info("Info Message");
		logger.warn("Warnning");
		logger.error("Error");
	}

}
