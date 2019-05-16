package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondProgramTest {


    SecondProgram sp = new SecondProgram();

    @Test
    public void CheckforCondition() {
        assertArrayEquals(new String[]{"india", "mumbai", "pune"}, sp.RemoveDuplicate(new String[]{"india", "mumbai", "india", "pune"}));
        assertArrayEquals(new  String[]{"keralalondon","andralondon","mumbailondon"},sp.AppendLast(new String[]{"london","paris","france"},new String[]{"kerala","andra","mumbai"}));
        assertArrayEquals(new  String[]{"andralondon","andraparis","andrafrance"},sp.PrependFirst(new String[]{"london","paris","france"},new String[]{"kerala","andra","mumbai"}));
        assertArrayEquals(new  String[]{"equal","notequal","equal"},sp.CompareArray(new String[]{"london","paris","france"},new String[]{"london","usa","france"}));


    }
    }
