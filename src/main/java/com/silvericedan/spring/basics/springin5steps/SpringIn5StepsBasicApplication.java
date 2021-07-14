package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	//We need to look for using spring this questions:
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for a bean? => no need because we are in the same package

	public static void main(String[] args) {

		//no need to do this, spring will manage creation
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		//Application Context will mantain all the beans

		//This is an alternative way of using Spring without Boot, using AnnotationConfigApplicationContext
		//instead of using ApplicationContext from Spring-Boot.
		//We use "try()" to ensure if something goes wrong, the application closes
		//Also instead of try, we could use applicationContext.close() at the end.
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] {12,4,6},3);
			System.out.println(result);
		}
	}
}
