package com.spartaglobal;

import java.util.Map;

public class PostcodeDTO {
    private String postcode;
    private int quality;
    private int eastings;
    private int northings;
    private String country;
    private String nhs_ha;
    private String admin_county;
    private String admin_district;
    private String admin_ward;
    private double longitude;
    private String parliamentary_constituency;
    private String european_electoral_region;
    private String primary_care_trust;
    private String region;
    private String parish;
    private String lsoa;
    private String msoa;
    private String ced;
    private String ccg;
    private String nuts;
    private Map<String, String> codes;

    public Map<String, String> getCodes() {
        return codes;
    }

    public String getAdmin_county() {
        return admin_county;
    }
    
    public String getAdmin_district() {
        return admin_district;
    }

    public String getAdmin_ward() {
        return admin_ward;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getParliamentary_constituency() {
        return parliamentary_constituency;
    }

    public String getEuropean_electoral_region() {
        return european_electoral_region;
    }

    public String getPrimary_care_trust() {
        return primary_care_trust;
    }

    public String getRegion() {
        return region;
    }

    public String getParish() {
        return parish;
    }

    public String getLsoa() {
        return lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public String getCed() {
        return ced;
    }

    public String getCcg() {
        return ccg;
    }

    public String getNuts() {
        return nuts;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getQuality() {
        return quality;
    }

    public int getEastings() {
        return eastings;
    }

    public int getNorthings() {
        return northings;
    }

    public String getCountry() {
        return country;
    }

    public String getNhs_ha() {
        return nhs_ha;
    }


}
