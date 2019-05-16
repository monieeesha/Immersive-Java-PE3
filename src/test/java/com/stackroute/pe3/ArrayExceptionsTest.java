package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayExceptionsTest {

    ArrayExceptions exceptionGenerator = new ArrayExceptions();

    @Test
    public void testStringArrayTraverse() {
        assertEquals("Caught NegativeArraySizeException", exceptionGenerator.stringArrayTraverse(new String[]{"-1", "hello", "hi", "bye", "some", "text"}));
        assertEquals("Caught ArrayIndexOutOfBoundsException", exceptionGenerator.stringArrayTraverse(new String[]{"4", "hello", "hi", "bye", "some", "text", "hello"}));
        assertEquals("Caught NullPointerException", exceptionGenerator.stringArrayTraverse(null));
    }

}