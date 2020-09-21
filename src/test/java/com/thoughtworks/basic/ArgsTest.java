package com.thoughtworks.basic;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class ArgsTest {
    @Test
    public void should_return_string_list_when_scan_given_string(){
        //given
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);

        //when
        List<Arg> keyValuesPairs = args.scan();

        //then
        assertEquals(3, keyValuesPairs.size());
        assertEquals(new Arg("l true"), keyValuesPairs.get(0));
        assertEquals(new Arg("p 8080"), keyValuesPairs.get(1));
        assertEquals(new Arg("d usr/logs"), keyValuesPairs.get(2));
    }
}
