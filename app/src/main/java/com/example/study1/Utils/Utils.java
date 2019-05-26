package com.example.study1.Utils;

public class Utils {

    public static int toInt(String number, int defaultValue){
        int returnValue = defaultValue;

        if(number != null && number.length() > 0){
            try{
                returnValue = Integer.parseInt(number);
            }catch (Exception e){

            }
        }
        return returnValue;
    }


}
