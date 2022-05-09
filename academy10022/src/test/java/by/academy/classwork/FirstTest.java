package by.academy.classwork;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void mathDivide(){
        Assert.assertEquals(5, Calculator.divide(10,2));
    }

    @Test (expected = ArithmeticException.class)
    public void testException(){
        int i = 10/0;
    }

    @Test (timeout = 1000)
    public void timeout(){
        for (Integer i = 0; i<1000;i++){
            System.err.println(i);
        }
    }
}
