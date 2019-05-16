package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveTest {


    Consecutive con;
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
        con=new Consecutive();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        con=null;

        System.out.println("Inside After");

    }

    @Test
    public void  ChecknonConsecutive()
    {

        String input="6,6,6,6,6,6";

        String result=con.Checkcons(input);

        //assert
        assertEquals("nonconsecutive",result);
    }

    @Test
    public void  ChecknegativeCons()
    {

        String input="0,-1,-2,-3,-4,-5";

        String result=con.Checkcons(input);

        //assert
        assertEquals("consecutive",result);
    }



    @Test
    public void  Checkconsecutivenine()
    {

        String input="98,96,95,94,93";

        String result=con.Checkcons(input);

        //assert
        assertEquals("nonconsecutive",result);
    }
    @Test
    public void  Checkconsecutivefive()
    {

        String input="54,53,52,51,50,49,48";

        String result=con.Checkcons(input);

        //assert
        assertEquals("consecutive",result);
    }


}