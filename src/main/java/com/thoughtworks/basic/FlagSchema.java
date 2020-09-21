package com.thoughtworks.basic;

public class FlagSchema {
    private final String flag;
    private final Object type;

    public FlagSchema(String flag, Object type) {
        this.flag = flag;
        this.type = type;
    }

    public boolean equalsWith(String flag){
        return flag.equalsIgnoreCase(this.flag);
    }

    public Object getType(){
        return type;
    }

    public Object getDefaultValue(String flag){
        switch(flag){
            case "l":
                return String.valueOf(false);
            case "p":
                return String.valueOf(0);
            case "d":
                return "";
        }
        return null;
    }
}
