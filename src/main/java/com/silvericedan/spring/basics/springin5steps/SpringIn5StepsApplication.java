package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.services.BinarySearchImpl;
import com.silvericedan.spring.basics.springin5steps.services.BubbleSortAlgorithm;
import com.silvericedan.spring.basics.springin5steps.services.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
