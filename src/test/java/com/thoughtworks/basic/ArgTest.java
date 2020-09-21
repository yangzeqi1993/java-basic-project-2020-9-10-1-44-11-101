package com.thoughtworks.basic;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ArgTest {
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


}
