package com.example.spring.mvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	private static final Logger logger = Logger.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String test() {
		final String message = "Hello logging!";
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
        
		return "welcome";
	}
}

