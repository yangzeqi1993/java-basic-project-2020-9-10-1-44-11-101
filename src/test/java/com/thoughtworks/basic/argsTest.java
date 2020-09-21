package com.thoughtworks.basic;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class argsTest {
    @Test
    public void should_return_string_list_when_scan_given_string(){
        //given
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);

        //when
        List<Arg> keyValuesPairs = args.scan();

        //then
        assertEquals(3, keyValuesPairs.size());
        assertTrue(keyValuesPairs.contains(new Arg("l true")));
    }
}
