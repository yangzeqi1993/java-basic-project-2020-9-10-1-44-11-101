package com.thoughtworks.basic;

import com.thoughtworks.basic.Type.BooleanType;
import com.thoughtworks.basic.Type.IntegerType;
import com.thoughtworks.basic.Type.StringType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTest {

    /**************************************
    异常场景不知道如何写测试，也不会写实现@@
     *************************************/
    @Test
    public void should_return_true_when_use_BooleanType_given_text_true(){
        //given
        String booleanValue = "true";

        //when

        //then
        assertEquals(true,new BooleanType().getType(booleanValue));
    }

    @Test
    public void should_return_false_when_use_BooleanType_given_text_false(){
        //given
        String booleanValue = "false";

        //when

        //then
        assertEquals(false,new BooleanType().getType(booleanValue));
    }

    @Test
    public void should_return_string_when_use_StringType_given_text_string(){
        //given
        String stringValue = "usr/tcp";

        //when

        //then
        assertEquals("usr/tcp",new StringType().getType(stringValue));
    }

    @Test
    public void should_return_string_when_use_IntegerType_given_text_string(){
        //given
        String intValue = "8080";

        //when

        //then
        assertEquals(8080,new IntegerType().getType(intValue));
    }
}
