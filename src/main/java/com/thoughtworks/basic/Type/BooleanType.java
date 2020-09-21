package com.thoughtworks.basic.Type;

public class BooleanType implements TypeInterface  {
    @Override
    public Object getType(String value) {
        Object o = null;
        if (value.equalsIgnoreCase("true")){
            o = true;
        }else if(value.equalsIgnoreCase("false")){
            o = false;
        }else {
            System.out.println("boolean值错误！");
        }
        return o;
    }
}
