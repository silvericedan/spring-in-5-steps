package com.silvericedan.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){

        //Logic for Quick Sort

        return numbers;
    }
}
