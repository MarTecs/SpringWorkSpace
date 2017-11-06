package com.itheima.demo1;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Demo1 {
	
	Logger logger = Logger.getLogger(Demo1.class);
	
	@Test
	public void run() {
		Demo1 demo = new Demo1();
		logger.info("a");
		logger.error("what");
	}

}
