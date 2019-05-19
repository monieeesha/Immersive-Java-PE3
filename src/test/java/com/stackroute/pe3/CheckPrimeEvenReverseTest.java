package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckPrimeEvenReverseTest {



    CheckPrimeEvenReverse fp;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        fp=new CheckPrimeEvenReverse();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        fp=null;

        System.out.println("Inside After");

    }


    /*Traverse the array Remove all prime numbers*/

    @Test
    public void primeRemoval_GivenArray_ArrayWithouPrime()
    {
        assertArrayEquals(new int[]{12,14,15}, fp.RemovePrime(new int[]{4,12,13,14,15}));
        ;
    }
    /*Traverse the array check for Even and Odd numbers*/

    @Test
    public void   check_GivenArray_ArraySpecifyingEvenOdd()
    {

        assertArrayEquals(new String[]{"Even","Odd","Even","Odd"}, fp.IsEvenOdd(new int[]{4,2,3,6,5}));

    }
    /*Traverse the array and Reverse the given array*/
    @Test
    public void  reverse_GivenArray_ArrayReversed()
    {

        assertArrayEquals(new int[]{25,24,23,22}, fp.ReverseArr(new int[]{4,22,23,24,25}));

    }
    /*Remove all prime numbers if the given array contain all prime numbers return Empty Array*/
    @Test
    public void primeRemoval_GivenArrayWithAllPrime_EmptyArray()
    {

        assertArrayEquals(new int[]{}, fp.RemovePrime(new int[]{4,11,11,11,11}));

    }
    /*reverse the array containing repeated elements*/
    @Test
    public void reverse_GivenArrayRepeatedElements_ReversedArray()
    {

        assertArrayEquals(new int[]{25,24,22,22}, fp.ReverseArr(new int[]{4,22,22,24,25}));
    }


}