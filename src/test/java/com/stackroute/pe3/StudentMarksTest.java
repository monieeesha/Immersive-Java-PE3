package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {


    StudentMarks sm;
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
        sm=new StudentMarks();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        sm=null;

        System.out.println("Inside After");

    }

    @Test
    public void  CheckForGreater()
    {



        String result=sm.CheckRange(112);

        //assert
        assertEquals("input should be less than 100",result);
    }

    @Test
    public void  CheckForNegative()
    {



        String result=sm.CheckRange(-1);

        //assert
        assertEquals("input should be greater than 0",result);
    }



    @Test
    public void  CheckForActual()
    {



        String result=sm.CheckRange(10);

        //assert
        assertEquals("true",result);
    }

}