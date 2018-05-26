package com.softwaresunleashed.dog.utils;

public class Utils {


    // Function to extract k bits from p position
    // and returns the extracted value as integer
    public static long bitExtracted(long number, int k, int position)
    {
        long number_to_mask = number >> position;
        long mask = 0;
        while(k-- > 0){
            mask = mask | (1 << k);
        }
        return number_to_mask & mask;
    }

    public static Long HexToLong(String Hex) {
        Long lngHexVal = new Long(-1);

        if(Hex.startsWith("0x"))
            Hex = Hex.substring(2);
        try{
            lngHexVal = Long.parseLong(Hex, 16);
            return lngHexVal;
        }catch (Exception e){
            e.printStackTrace();
        }
        return lngHexVal;
    }


}
