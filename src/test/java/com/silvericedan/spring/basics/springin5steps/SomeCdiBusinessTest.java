package com.silvericedan.spring.basics.springin5steps;

import com.silvericedan.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.silvericedan.spring.basics.springin5steps.cdi.SomeCdiDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


//Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    //Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDAO daoMock;

    @Test
    public void testBasicScenario(){
        //when daoMock.getData() method is called return int[]{2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        //we dont allow the actual method to happen, we replace it with a mock and
        //populate the data we send in the test
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_NoElements(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});
        assertEquals(2, business.findGreatest());
    }
}
