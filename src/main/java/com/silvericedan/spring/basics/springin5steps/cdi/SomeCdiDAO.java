package com.silvericedan.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {

    //we simulate some data coming from a database
    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
