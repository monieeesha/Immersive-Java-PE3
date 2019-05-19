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
    /*check the grade and display appropriate message*/
    @Test
    public void  check_GivenGradeArray_ReturmMessage() {

        //assert
        assertArrayEquals(new String[]{"input should be greater than 0", "input should be less than 100", "true"}, sm.CheckRange(new int[]{-1, 112, 85}));

    }
}