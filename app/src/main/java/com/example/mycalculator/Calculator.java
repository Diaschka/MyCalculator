package com.example.mycalculator;

import java.math.BigDecimal;

public class Calculator {

    public float getFloats(String calcArg){
        float floatArg = Float.parseFloat(calcArg);
        return floatArg;
    }

    public String getStrings(float result){
        BigDecimal bd = new BigDecimal(result);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        String resultString = bd.toString();
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

    public String division(String argOne,String argTwo){
        float result = getFloats(argOne) / getFloats(argTwo);
        return getStrings(result);
    }

}
