package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Args {
    private String argsText;
    private List<Arg> argPairs;

    public Args(String argsText){
        this.argsText = argsText;
    }

    public List<Arg> scan(){
        String prefix = "-";
        List<String> keyValues = Arrays.asList(argsText.split(prefix));
        keyValues = keyValues.stream()
                .map(String::trim)
                .collect(Collectors.toList());

        argPairs = keyValues.subList(1, keyValues.size())
                .stream()
                .map(Arg::new)
                .collect(Collectors.toList());
        return argPairs;
    }

}
