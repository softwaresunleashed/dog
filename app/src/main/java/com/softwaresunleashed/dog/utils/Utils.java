package com.softwaresunleashed.dog.utils;

public class Utils {


    // Function to extract k bits from p position
    // and returns the extracted value as integer
    static int bitExtracted(int number, int k, int p)
    {
        return (((1 << k) - 1) & (number >> (p - 1)));
    }




}
