package com.spartaglobal;

import java.util.Map;

public class PostcodeDTO {

    private int status;
    private String postcode;
    private int eastings;
    private int northings;
    private String country;
    private String nhs_ha;
    private String admin_county;
    private String admin_district;
    private String admin_ward;
    private double longitude;
    private double latitude;
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
    private Map<String, Object> result;
    private int quality;
    private Map codes;

    public Map getCodes() {
        Map listResult = result;
        codes =(Map)listResult.get("codes");
        return codes;
    }

    public int getStatus() {
        return status;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public String getPostcode() {
        postcode = (String) getResult().get("postcode");
        return postcode;
    }

    public int getQuality() {
        quality = (Integer) getResult().get("quality");
        return quality;
    }

    public int getEastings() {
        eastings = (Integer) getResult().get("eastings");
        return eastings;
    }

    public int getNorthings() {
        northings = (Integer) getResult().get("northings");
        return northings;
    }

    public String getCountry() {
        country = (String) getResult().get("country");
        return country;
    }

    public String getNhs_ha() {
        nhs_ha = (String) getResult().get("nhs_ha");
        return nhs_ha;
    }

    public double getLongitude() {
        longitude = (double) getResult().get("longitude");
        return longitude;
    }

    public double getLatitude() {
        latitude = (double) getResult().get("latitude");
        return latitude;
    }

    public String getEuropean_electoral_region() {
        european_electoral_region = (String) getResult().get("european_electoral_region");
        return european_electoral_region;
    }

    public String getPrimary_care_trust() {
        primary_care_trust = (String) getResult().get("primary_care_trust");
        return primary_care_trust;
    }

    public String getRegion() {
        region = (String) getResult().get("region");
        return region;
    }

    public String getLsoa() {
        lsoa = (String) getResult().get("lsoa");
        return lsoa;
    }

    public String getMsoa() {
        msoa = (String) getResult().get("msoa");
        return msoa;
    }

    public String getAdmin_district() {
        admin_district = (String) getCodes().get("admin_district");
        return admin_district;
    }

    public String getAdmin_county() {
         admin_county = (String) getCodes().get("admin_county");
        return admin_county;
    }

    public String getAdmin_ward() {
        admin_ward = (String) getCodes().get("admin_ward");
        return admin_ward;
    }
    public String getParish() {
        parish = (String) getCodes().get("parish");
        return parish;
    }

    public String getParliamentary_constituency() {
        parliamentary_constituency = (String) getCodes().get("parliamentary_constituency");
        return parliamentary_constituency;
    }

    public String getCcg() {
        ccg = (String) getCodes().get("ccg");
        return ccg;
    }

    public String getCed() {
        ced = (String) getCodes().get("ced");
        return ced;
    }

    public String getNuts() {
        nuts = (String) getCodes().get("nuts");
        return nuts;
    }

}
