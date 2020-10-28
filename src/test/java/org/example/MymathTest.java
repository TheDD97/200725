package org.example;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MymathTest {

    private static MyMath math;

    @Before
    public void prepare(){
        System.out.println("OK");
        math = new MyMath();
    }

    @Test
    public void primeNumbersGeneratorsWorks(){
      assertEquals(new LinkedList<>(),math.primeNumbersGenerator(1));
      assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.primeNumbersGenerator(20));
    }

    @Test
    public void isPrimeWorks(){
        List<Integer> primes = Arrays.asList(11,13,17,23,31,41,53,67,83,101);
    }
}
