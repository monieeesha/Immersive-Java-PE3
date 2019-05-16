package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstProgramTest {



    FirstProgram fp;
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
        fp=new FirstProgram();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        fp=null;

        System.out.println("Inside After");

    }



    @Test
    public void primePositive()
    {
        assertArrayEquals(new int[]{12,14,15}, fp.RemovePrime(new int[]{4,12,13,14,15}));
        assertArrayEquals(new String[]{"Even","Odd","Even","Odd"}, fp.IsEvenOdd(new int[]{4,2,3,6,5}));
        assertArrayEquals(new int[]{25,24,23,22}, fp.ReverseArr(new int[]{4,22,23,24,25}));
        assertArrayEquals(new int[]{}, fp.RemovePrime(new int[]{4,11,11,11,11}));
        assertArrayEquals(new int[]{25,24,22,22}, fp.ReverseArr(new int[]{4,22,22,24,25}));




    }




}