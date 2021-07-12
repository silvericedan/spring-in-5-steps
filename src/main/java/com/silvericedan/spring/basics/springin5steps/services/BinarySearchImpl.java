package com.silvericedan.spring.basics.springin5steps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    //One way without using primary, of using the implementation that we need is
    //naming the variable with the same name that the algorithm, it will use that implementation
    //@Autowired
    //private SortAlgorithm bubbleSortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sorted = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Implementing Sorting Logic
        //Bubble Sort Algorithm
        //Search the array

        return 3; //just simple return to mock results
    }
}
