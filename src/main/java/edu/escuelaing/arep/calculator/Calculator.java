package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;

public class Calculator {

    public static String sin(double num){
        Gson json = new Gson();
        String res = "{\"res\":" +Math.sin(num)+"}";
        return json.toJson(res);
    }

    public static String cos(double num){
        Gson json = new Gson();
        String res = "{\"res\":" +Math.cos(num)+"}";
        return json.toJson(res);
    }

    public static String tan(double num){
        Gson json = new Gson();
        String res = "{\"res\":" +Math.tan(num)+"}";
        return json.toJson(res);
    }

    public static String operate(int value, String operation){
        switch (operation){
            case "cos":
                return cos(value);
            case "sin":
                return sin(value);
            case "tan":
                return tan(value);
        }
        return "No válido";
    }

}
