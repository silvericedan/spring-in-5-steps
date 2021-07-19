package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class SomeCdiBusinessTest {

    //Get this bean from the context
    @Autowired
    SomeCdiBusiness business;

    @Test
    public void testBasicScenario(){
        //call method on binarySearch
        int actualResult = business.findGreatest();
        //check if the value is correct, we have made the greatest in the array 100
        assertEquals(100,actualResult);
    }
}
