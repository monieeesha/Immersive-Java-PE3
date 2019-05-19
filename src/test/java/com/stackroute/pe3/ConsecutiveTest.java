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
   /*if a given array donot contain consecutive numbers*/
    @Test
    public void  check_NonConsecutiveRepeatedElement_ReturnNonConsecutive()
    {
        //assert
        assertEquals("nonconsecutive",con.Checkcons("6,6,6,6,6,6"));
    }
    /*check wheather the given array contains consecutive numbers whwn the given array contain negative numbers*/
    @Test
    public void  check_NegativeCons_ReturnConsecutive()
    {
        //assert
        assertEquals("consecutive",con.Checkcons("0,-1,-2,-3,-4,-5"));
    }
    /*if a given array donot consecutive numbers*/

    @Test
    public void  checkc_Nonsecutivenine_ReturnNonConsecutive()
    {
        //assert
        assertEquals("nonconsecutive",con.Checkcons("98,97,96,95,92,93"));
    }
    @Test
    public void  check_Consecutivefive_ReturnConsecutive()
    {

        //assert
        assertEquals("consecutive",con.Checkcons("54,53,52,51,50,49,48"));
    }


}