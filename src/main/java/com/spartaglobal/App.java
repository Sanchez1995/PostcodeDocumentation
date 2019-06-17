package com.spartaglobal;

import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        PostcodeDeserialiser postcodeDeserialiser = new PostcodeDeserialiser("resources/postcode.json");
        System.out.println(postcodeDeserialiser.postcodesMapped.getStatus());

        System.out.println(postcodeDeserialiser.postcodesMapped.getPostcode());
        System.out.println(postcodeDeserialiser.postcodesMapped.getQuality());
        System.out.println(postcodeDeserialiser.postcodesMapped.getEastings());
        System.out.println(postcodeDeserialiser.postcodesMapped.getNorthings());
        System.out.println(postcodeDeserialiser.postcodesMapped.getCountry());
        System.out.println(postcodeDeserialiser.postcodesMapped.getNhs_ha());
        System.out.println(postcodeDeserialiser.postcodesMapped.getLongitude());
        System.out.println(postcodeDeserialiser.postcodesMapped.getLatitude());
        System.out.println(postcodeDeserialiser.postcodesMapped.getEuropean_electoral_region());
        System.out.println(postcodeDeserialiser.postcodesMapped.getPrimary_care_trust());
        System.out.println(postcodeDeserialiser.postcodesMapped.getRegion());
        System.out.println(postcodeDeserialiser.postcodesMapped.getLsoa());
        System.out.println(postcodeDeserialiser.postcodesMapped.getMsoa());

        //what to do for parameters with second values?
        System.out.println(postcodeDeserialiser.postcodesMapped.getResult().get("parish"));
        System.out.println(postcodeDeserialiser.postcodesMapped.getResult().get("admin_ward"));


        System.out.println(postcodeDeserialiser.postcodesMapped.getAdmin_district());
        System.out.println(postcodeDeserialiser.postcodesMapped.getAdmin_county());
        System.out.println(postcodeDeserialiser.postcodesMapped.getAdmin_ward());
        System.out.println(postcodeDeserialiser.postcodesMapped.getParish());
        System.out.println(postcodeDeserialiser.postcodesMapped.getParliamentary_constituency());
        System.out.println(postcodeDeserialiser.postcodesMapped.getCcg());
        System.out.println(postcodeDeserialiser.postcodesMapped.getCed());
        System.out.println(postcodeDeserialiser.postcodesMapped.getNuts());






    }
}
