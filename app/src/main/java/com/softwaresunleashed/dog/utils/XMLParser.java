package com.softwaresunleashed.dog.utils;

import com.softwaresunleashed.dog.debugregs.base_classes.RegBitField;
import com.softwaresunleashed.dog.debugregs.base_classes.ValidValues;

import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.ArrayList;


////<BIT_FIELD>
////        <START_BIT VAL="" />
////        <END_BIT VAL=  />
////        <NAME VAL= />
////        <FUNCTION VAL= />
////
////        <VALID_VALUE VAL="0" VAL_MEANING="" />
////        <VALID_VALUE VAL="0" VAL_MEANING="" />
////</BIT_FIELD>

public class XMLParser {

    // Tags
    private static String BIT_FIELD_TAG = "BIT_FIELD";
    private static String START_BIT_TAG = "START_BIT";
    private static String END_BIT_TAG = "END_BIT";
    private static String NAME_TAG = "NAME";
    private static String FUNCTION_TAG = "FUNCTION";
    private static String VALID_VALUE_TAG = "VALID_VALUE";


    // Attributes
    private static String VALUE_ATTR = "VAL";
    private static String VALUE_MEANING_ATTR = "VAL_MEANING";


    private XmlPullParserFactory xmlFactoryObject;
    private XmlPullParser myParser;
    private ArrayList<RegBitField> regBitFieldsArray;

    public ArrayList<RegBitField> parseXML(String xml_string, String register_value){

        regBitFieldsArray = new ArrayList<RegBitField>();
        try{
            xmlFactoryObject = XmlPullParserFactory.newInstance();
            myParser = xmlFactoryObject.newPullParser();

            InputStream inputStreamString = IOUtils.toInputStream(xml_string, "UTF-8");
            myParser.setInput(inputStreamString, null);

            int event = myParser.getEventType();
            RegBitField regBitField = null;
            while (event != XmlPullParser.END_DOCUMENT)  {

                String name=myParser.getName();
                switch (event){
                    case XmlPullParser.START_TAG:
                        if(name.equals(BIT_FIELD_TAG)){
                            regBitField = new RegBitField();
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        if(name.equals(START_BIT_TAG)){
                            regBitField.start_bit = Integer.parseInt(myParser.getAttributeValue(null, VALUE_ATTR));
                        }
                        if(name.equals(END_BIT_TAG)){
                            regBitField.end_bit = Integer.parseInt(myParser.getAttributeValue(null, VALUE_ATTR));
                        }
                        if(name.equals(NAME_TAG)){
                            regBitField.field_name = myParser.getAttributeValue(null, VALUE_ATTR);
                        }
                        if(name.equals(FUNCTION_TAG)){
                            regBitField.field_function = myParser.getAttributeValue(null, VALUE_ATTR);
                        }
                        if(name.equals(VALID_VALUE_TAG)){
                            int value = Integer.parseInt(myParser.getAttributeValue(null, VALUE_ATTR));
                            String meaning = myParser.getAttributeValue(null, VALUE_MEANING_ATTR);
                            ValidValues validValues = new ValidValues(value, meaning);
                            regBitField.validValuesArrayList.add(validValues);
                        }
                        if(name.equals(BIT_FIELD_TAG)){
                            // Add the bit field description to Bit Field Array
                            regBitFieldsArray.add(regBitField);
                        }
                        break;
                }
                event = myParser.next();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        // Finally return the list of bit fields created
        return regBitFieldsArray;
    }

}
