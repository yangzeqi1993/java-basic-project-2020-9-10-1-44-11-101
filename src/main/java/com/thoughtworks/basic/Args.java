package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Args {
    private String argsText;

    public Args(String argsText){
        this.argsText = argsText;
    }

    public List<String> scan(){
        String prefix = "-";
        List<String> keyValues = Arrays.asList(argsText.split(prefix));
        keyValues = keyValues.stream()
                .map(String::trim)
                .collect(Collectors.toList());
        return keyValues.subList(1, keyValues.size());
    }

//    public Set<FlagSchema> format(List<String> args){
//        Set <FlagSchema> flagSchemas = new HashSet<>();
//        args = args.stream()
//                .map(String::trim)
//                .collect(Collectors.toList());
//    }
}
