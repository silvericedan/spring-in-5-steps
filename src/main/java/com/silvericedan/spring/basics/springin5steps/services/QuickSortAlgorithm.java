package com.silvericedan.spring.basics.springin5steps.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){

        //Logic for Quick Sort

        return numbers;
    }
}
