package com.testapp;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
    
    @Test
    public void test(){
        int x = Calc.add(25, 25);
        assertEquals(50, x);
        System.out.println("test run done!");
    }

    @Test
   public  void testArea(){

        assertEquals(24, Calc.area(6, 4));
    }
}
