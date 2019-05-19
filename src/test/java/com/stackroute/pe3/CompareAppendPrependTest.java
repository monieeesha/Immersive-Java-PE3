package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class CompareAppendPrependTest {


    CompareAppendPrepend sp ;
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
        sp=new CompareAppendPrepend();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        sp=null;

        System.out.println("Inside After");

    }

    /*remove the repeated elements in an array*/
    @Test
    public void remove_GivenArrays_RemoveRepeated() {
        assertArrayEquals(new String[]{"india", "mumbai", "pune"}, sp.RemoveDuplicate(new String[]{"india", "mumbai", "india", "pune"}));


    }
    /*append the first element of array1 to the end of array2*/
    @Test
    public void append_GivenArrays_AppendFirstElementofArray1ToArray2() {

        assertArrayEquals(new  String[]{"keralalondon","andralondon","mumbailondon"},sp.AppendLast(new String[]{"london","paris","france"},new String[]{"kerala","andra","mumbai"}));


    }
    /*prepend the mid element of array2 to array1*/
    @Test
    public void prepend_GivenArrays_PrependMidElementOfArray2toArray1() {

        assertArrayEquals(new  String[]{"andralondon","andraparis","andrafrance"},sp.PrependFirst(new String[]{"london","paris","france"},new String[]{"kerala","andra","mumbai"}));


    }
    /*conmpare the two given array check wheather eqaula oer notequal*/
    @Test
    public void  compare_GivenArrays_ComparedElements() {

        assertArrayEquals(new  String[]{"equal","notequal","equal"},sp.CompareArray(new String[]{"london","paris","france"},new String[]{"london","usa","france"}));


    }
    }
