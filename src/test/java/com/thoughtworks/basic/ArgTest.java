package com.thoughtworks.basic;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ArgTest {
    /**************************************
     异常场景不知道如何写测试，也不会写实现@@
     *************************************/
    @Test
    public void should_return_arg_pair_class_when_new_arg_given_arg_pair_text(){
        //given
        String argText = "l true";
        Set<FlagSchema> flagSchemas = new HashSet<>();
        flagSchemas.add(new FlagSchema("l", Boolean.TYPE));
        Schema schema = new Schema(flagSchemas);

        //when
        Arg arg = new Arg(argText,schema);

        //then
        assertEquals("l", arg.getFlag());
        assertEquals("true", arg.getValue());
        assertEquals(Boolean.TYPE, arg.getType());

    }

    @Test
    public void should_return_true_class_when_parseValue_given_arg_text_is_1_true(){
        //given
        String argText = "l true";
        Set<FlagSchema> flagSchemas = new HashSet<>();
        flagSchemas.add(new FlagSchema("l", Boolean.TYPE));
        Schema schema = new Schema(flagSchemas);
        Arg arg = new Arg(argText,schema);
        //
        Object value = arg.parseValue();

        //when
        assertEquals(true, value);
    }

    @Test
    public void should_return_int_8080_class_when_parseValue_given_arg_text_is_p_8080(){
        //given
        String argText = "p 8080";
        Set<FlagSchema> flagSchemas = new HashSet<>();
        flagSchemas.add(new FlagSchema("p", Integer.TYPE));
        Schema schema = new Schema(flagSchemas);
        Arg arg = new Arg(argText,schema);
        //
        Object value = arg.parseValue();

        //when
        assertEquals(8080, value);
    }

    @Test
    public void should_return_string_class_when_parseValue_given_arg_text_is_d_use_tcp(){
        //given
        String argText = "d use/tcp";
        Set<FlagSchema> flagSchemas = new HashSet<>();
        flagSchemas.add(new FlagSchema("d", Integer.TYPE));
        Schema schema = new Schema(flagSchemas);
        Arg arg = new Arg(argText,schema);
        //
        Object value = arg.parseValue();

        //when
        assertEquals("use/tcp", value);
    }

}
