package com.demo.trigger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TriggerTest {
	
//	private Logger log  = LoggerFactory.getLogger("Quartz");
	
	private static Logger log = LoggerFactory.getLogger(TriggerTest.class);

	public void execute() {
		log.info("现在开始job......");
		System.out.println("现在开始job......");
	}
}
