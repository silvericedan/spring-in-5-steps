package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.services.BinarySearchImpl;
import com.silvericedan.spring.basics.springin5steps.services.BubbleSortAlgorithm;
import com.silvericedan.spring.basics.springin5steps.services.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//We need to look for using spring this questions:
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for a bean? => no need because we are in the same package

	public static void main(String[] args) {

		//no need to do this, spring will manage creation
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		//Application Context will mantain all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
	}

}
