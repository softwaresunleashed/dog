package com.softwaresunleashed.dog.utils;

import com.softwaresunleashed.dog.debugregs.base_classes.RegBitField;
import com.softwaresunleashed.dog.debugregs.base_classes.ValidValues;

import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

//<register-groups architecture="ARM" core="CortexA53" processor="LS1012A" processor-type="">
//        <register-group name="CORE">
//        <register name="X0">
//        <value>0x00000000021c0500</value>
//        <custom-groups></custom-groups>
//        </register>
//        <register name="X1">
//        <value>0x0000000000000060</value>
//        <custom-groups></custom-groups>
//        </register>


public class InputFileXMLParser {

    // Tags
    private static String REGISTER_GROUPS_TAG = "register-groups";
    private static String REGISTER_GROUP_TAG = "register-group";
    private static String REGISTER_TAG = "register";
    private static String VALUE_TAG = "value";


    // Attributes
    private static String ARCHITECTURE_ATTR = "architecture";
    private static String PROCESSOR_ATTR = "processor";
    private static String PROCESSOR_TYPE_ATTR = "processor-type";
    private static String CORE_ATTR = "core";
    private static String NAME_ATTR = "name";


    private XmlPullParserFactory xmlFactoryObject;
    private XmlPullParser myParser;
    private ArrayList<String> regAddressValuePair;


    public ArrayList<String> parseXML(FileInputStream fisXML_Dump_String){

        regAddressValuePair = new ArrayList<String>();
        try{
            xmlFactoryObject = XmlPullParserFactory.newInstance();
            myParser = xmlFactoryObject.newPullParser();

            myParser.setInput(fisXML_Dump_String, "UTF-8");

            int event = myParser.getEventType();
            StringBuilder pair = null;
            String previous_open_tag = null;
            while (event != XmlPullParser.END_DOCUMENT)  {

                String name=myParser.getName();
                switch (event){
                    case XmlPullParser.START_TAG:
                        previous_open_tag = name;
                        if(name.equals(REGISTER_TAG)){
                            pair = new StringBuilder();
                            pair.append(myParser.getAttributeValue(null, NAME_ATTR));
                        }
                        break;

                    case XmlPullParser.TEXT:
                        if(previous_open_tag != null && previous_open_tag.equals(VALUE_TAG)) {
                            String tx = myParser.getText();
                            pair.append("," + tx);
                            previous_open_tag =  null;
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        if(name.equals(REGISTER_TAG)){
                            // Add the bit field to Bit Field Array
                            regAddressValuePair.add(pair.toString());
                        }
                        break;
                }
                event = myParser.next();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        // Finally return the list of bit fields created
        return regAddressValuePair;
    }

}
