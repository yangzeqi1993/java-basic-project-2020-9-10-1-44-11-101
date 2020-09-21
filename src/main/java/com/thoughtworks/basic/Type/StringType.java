package com.thoughtworks.basic.Type;

public class StringType implements TypeInterface  {
    @Override
    public Object getType(String value) {
        return value;
    }

}
