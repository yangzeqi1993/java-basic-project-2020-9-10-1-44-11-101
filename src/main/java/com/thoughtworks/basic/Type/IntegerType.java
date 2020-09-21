package com.thoughtworks.basic.Type;

public class IntegerType implements TypeInterface {
    @Override
    public Object getType(String value) {
        Object o = null;
        try{
            o = Integer.parseInt(value);
        }catch(Exception e){
            e.printStackTrace();
        }
        return o;
    }
}
