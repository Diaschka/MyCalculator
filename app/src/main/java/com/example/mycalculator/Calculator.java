package com.example.mycalculator;

public class Calculator {
    protected float argumentOne;
    protected float argumentTwo;
    protected float result;

    public float getFloats(String calcArg){
        float floatArg;
        if(calcArg == null){
            floatArg = 0;
        } else {
            floatArg = Float.parseFloat(calcArg);
        } return floatArg;
    }

    public String getStrings(float result){
        String resultString = Float.toString(result);
        return resultString;
    }

    public String addition(String arg1,String arg2){
        float result = getFloats(arg1) + getFloats(arg2);
        return getStrings(result);
    }

    public String subtraction(String argOne,String argTwo){
        float result = getFloats(argOne) - getFloats(argTwo);
        return getStrings(result);
    }

    public String multiplication(String argOne,String argTwo){
        float result = getFloats(argOne) * getFloats(argTwo);
        return getStrings(result);
    }

}
