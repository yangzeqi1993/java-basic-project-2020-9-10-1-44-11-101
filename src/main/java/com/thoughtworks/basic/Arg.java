package com.thoughtworks.basic;

import java.util.Objects;

public class Arg {
    private String flag;
    private String value;

    public Arg(String argPair){
        String[] argElement = argPair.split(" ");
        this.flag = argElement[0];
        this.value = argElement[1];
    }

    public String getFlag() {
        return flag;
    }

    public String getValue() {
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
