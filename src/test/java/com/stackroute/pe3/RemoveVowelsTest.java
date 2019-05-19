package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelsTest {


    RemoveVowels rv;
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
        rv=new RemoveVowels();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        rv=null;
        System.out.println("Inside After");

    }

    @Test
    public void remove_GivenArray_ArrayWithConsonants() {
        assertArrayEquals(new String[]{"hll", "h", "by", "sm", "txt"}, rv.ReadString(new String[]{"5", "hello", "hi", "bye", "some", "text"}));

    }
    @Test
    public void remove_GivenArrayWithOneVowel_EmptyArray()
    {

        assertArrayEquals(new String[]{""}, rv.ReadString(new String[]{"1","a"}));

    }
    @Test
    public void remove_GivenArrayWithOnlyVowels_EmptyArray()
    {

        assertArrayEquals(new String[]{"",""}, rv.ReadString(new String[]{"2", "aeiou", "ae"}));
    }
    @Test
    public void check_GivenArrayWithDigit_Array()
    {
        assertArrayEquals(new String[]{"String should contain only letter", "h", "String should contain only letter", "sm", "txt"}, rv.ReadString(new String[]{"5", "h55lo", "hi", "b0e", "some", "text"}));
    }
    @Test
    public void check_GivenArrayWithNull_Array()
    {

        assertArrayEquals(new String[]{"Strings cannot be null","h","String should contain only letter","Strings cannot be null","txt"}, rv.ReadString(new String[]{"5", "", "hi", "b0e", "", "text"}));
    }


}