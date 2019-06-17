package com.spartaglobal;

import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        //JacksonManual manual = new JacksonManual("resources/postcode.json");
        PostcodeDeserialiser postcodeDeserialiser = new PostcodeDeserialiser("resources/postcode.json");
        System.out.println(postcodeDeserialiser.postcodesMapped.getStatus());
        System.out.println(postcodeDeserialiser.postcodesMapped.getResult().get("postcode"));
        System.out.println(postcodeDeserialiser.postcodesMapped.getResult().get("eastings"));
        Map listCode = (Map) postcodeDeserialiser.postcodesMapped.getResult().get("codes");
        System.out.println(listCode.get("parish"));

    }
}
