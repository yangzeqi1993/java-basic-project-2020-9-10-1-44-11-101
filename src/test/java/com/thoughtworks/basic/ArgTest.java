package com.thoughtworks.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArgTest {
    @Test
    public void should_return_arg_pair_class_when_new_arg_given_arg_pair_text(){
        //given
        String argText = "l true";

        //when
        Arg arg = new Arg(argText);

        //then
        assertEquals("l", arg.getFlag());
        assertEquals("true", arg.getValue());
    }
}
