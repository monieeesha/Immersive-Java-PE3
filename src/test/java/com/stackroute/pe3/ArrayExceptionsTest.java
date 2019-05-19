package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayExceptionsTest {

    ArrayExceptions exceptionGenerator;

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
        exceptionGenerator=new ArrayExceptions();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        exceptionGenerator=null;

        System.out.println("Inside After");

    }
    /*generate the NegativeArraySizeException when the size is given as -1*/
    @Test
    public void array_GivenNegativeArraySize_ThrowsException() {
        assertEquals("Caught NegativeArraySizeException", exceptionGenerator.stringArrayTraverse(new String[]{"-1", "hello", "hi", "bye", "some", "text"}));

    }
    /*generate the array index out of bound Exceptionn when trying to store element exceeding array size*/
    @Test
    public void array_GivenArrayIndexOutOfBond_ThrowsException() {
        assertEquals("Caught ArrayIndexOutOfBoundsException", exceptionGenerator.stringArrayTraverse(new String[]{"4", "hello", "hi", "bye", "some", "text", "hello"}));

    }
    /*generate nullpointer exception when array do not contain any element*/
    @Test
    public void array_GivenEmptyArray_ThrowsException() {

        assertEquals("Caught NullPointerException", exceptionGenerator.stringArrayTraverse(null));
    }

}