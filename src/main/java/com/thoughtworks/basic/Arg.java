package com.thoughtworks.basic;

import com.thoughtworks.basic.Type.BooleanType;
import com.thoughtworks.basic.Type.IntegerType;
import com.thoughtworks.basic.Type.StringType;

import java.util.Objects;

public class Arg {
    private String flag;
    private String value;
    private Object type;

    public Arg(String argPair, Schema schema){
        String[] argElement = argPair.split(" ");
        this.flag = argElement[0];
        this.value = argElement[1];
        this.type = schema.getTypeOf(this.flag);
    }

    public String getFlag() {
        return flag;
    }

    public String getValue() {
        return value;
    }

    public Object getType() {
        return type;
    }

    public Object parseValue(){
        if(flag.equals("l")){
            return new BooleanType().getType(value);
        }
        if(flag.equals("p")){
            return new IntegerType().getType(value);
        }
        if(flag.equals("d")){
            return new StringType().getType(value);
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arg arg = (Arg) o;
        return flag.equals(arg.flag) &&
                value.equals(arg.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, value);
    }
}
