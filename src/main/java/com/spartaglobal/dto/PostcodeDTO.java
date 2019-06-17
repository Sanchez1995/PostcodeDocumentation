package com.spartaglobal.dto;

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
    private Map<String, String> codes;

    public Map<String, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<String, String> codes) {
        this.codes = codes;
    }

    public String getAdmin_county() {
        return admin_county;
    }

    public void setAdmin_county(String admin_county) {
        this.admin_county = admin_county;
    }

    public String getAdmin_district() {
        return admin_district;
    }

    public void setAdmin_district(String admin_district) {
        this.admin_district = admin_district;
    }

    public String getAdmin_ward() {
        return admin_ward;
    }

    public void setAdmin_ward(String admin_ward) {
        this.admin_ward = admin_ward;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getParliamentary_constituency() {
        return parliamentary_constituency;
    }

    public void setParliamentary_constituency(String parliamentary_constituency) {
        this.parliamentary_constituency = parliamentary_constituency;
    }

    public String getEuropean_electoral_region() {
        return european_electoral_region;
    }

    public void setEuropean_electoral_region(String european_electoral_region) {
        this.european_electoral_region = european_electoral_region;
    }

    public String getPrimary_care_trust() {
        return primary_care_trust;
    }

    public void setPrimary_care_trust(String primary_care_trust) {
        this.primary_care_trust = primary_care_trust;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getLsoa() {
        return lsoa;
    }

    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getCcg() {
        return ccg;
    }

    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    private String nuts;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getEastings() {
        return eastings;
    }

    public void setEastings(int eastings) {
        this.eastings = eastings;
    }

    public int getNorthings() {
        return northings;
    }

    public void setNorthings(int northings) {
        this.northings = northings;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNhs_ha() {
        return nhs_ha;
    }

    public void setNhs_ha(String nhs_ha) {
        this.nhs_ha = nhs_ha;
    }
}
