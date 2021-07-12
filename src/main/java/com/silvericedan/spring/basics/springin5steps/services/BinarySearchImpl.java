package com.silvericedan.spring.basics.springin5steps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//For defect, all beans are SINGLETON. With scope you can define them to be
//Prototype, each new call will instanciate a new object
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    //One way without using primary, of using the implementation that we need is
    //naming the variable with the same name that the algorithm, it will use that implementation
    //@Autowired
    //private SortAlgorithm bubbleSortAlgorithm;

    //Other option is using the @Qualifier with the nickname we selected, but
    //its preferred to use the upper option of naming.

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sorted = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Implementing Sorting Logic
        //Bubble Sort Algorithm
        //Search the array

        return 3; //just simple return to mock results
    }
}
