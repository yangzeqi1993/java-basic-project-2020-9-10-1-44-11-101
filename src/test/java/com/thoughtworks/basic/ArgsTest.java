package com.thoughtworks.basic;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ArgsTest {
    @Test
    public void should_return_string_list_when_scan_given_string(){
        //given
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);
        Set<FlagSchema> flagSchemas = new HashSet<>();
        flagSchemas.add(new FlagSchema("l", Boolean.TYPE));
        flagSchemas.add(new FlagSchema("p", Integer.TYPE));
        flagSchemas.add(new FlagSchema("d", String.class.getTypeName()));
        Schema schema = new Schema(flagSchemas);

        //when
        List<Arg> keyValuesPairs = args.scan(schema);

        //then
        assertEquals(3, keyValuesPairs.size());
        assertEquals(new Arg("l true",schema), keyValuesPairs.get(0));
        assertEquals(new Arg("p 8080",schema), keyValuesPairs.get(1));
        assertEquals(new Arg("d usr/logs",schema), keyValuesPairs.get(2));
    }
}
