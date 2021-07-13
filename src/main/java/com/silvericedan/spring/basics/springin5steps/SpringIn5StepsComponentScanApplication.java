package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.silvericedan.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	//We use this Logger to print in console when the app runs with "INFO ....."
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {


		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
	}

}
