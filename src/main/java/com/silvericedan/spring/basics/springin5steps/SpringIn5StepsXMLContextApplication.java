package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.xmlscope.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {

	//We use this Logger to print in console when the app runs with "INFO ....."
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")){

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

			//We want to see what are the beans that are currently in this app
			//We cast to (Object) because otherwise it only prints the first bean loaded, the first element of the array
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

			System.out.println(personDAO);
			System.out.println(personDAO.getXmlJdbcConnection());
		}


	}

}
