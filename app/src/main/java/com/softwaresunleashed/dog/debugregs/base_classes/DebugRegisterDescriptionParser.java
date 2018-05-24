package com.softwaresunleashed.dog.debugregs.base_classes;


import com.softwaresunleashed.dog.utils.DescriptionParser;
import com.softwaresunleashed.dog.utils.XMLParser;

import java.util.ArrayList;

public class DebugRegisterDescriptionParser {



    public static ArrayList<RegBitField> parseDescription(String description_text, String register_value){

        if(description_text.startsWith("<")){
            // Description is XML , parse it.
            return (new XMLParser()).parseXML(description_text, register_value);
        }else{
            // Description is from Database , parse it.
            return (new DescriptionParser()).parse(description_text, register_value);
        }
    }




}
