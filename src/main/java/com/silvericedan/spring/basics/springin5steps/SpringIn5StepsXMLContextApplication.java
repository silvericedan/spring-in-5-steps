package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.silvericedan.spring.basics.springin5steps.xmlscope.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {



	public static void main(String[] args) {


		try(ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")){

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

			System.out.println(personDAO);
			System.out.println(personDAO.getXmlJdbcConnection());
		}


	}

}
