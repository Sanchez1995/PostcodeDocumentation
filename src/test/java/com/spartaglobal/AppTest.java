package com.spartaglobal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static PostcodeDeserialiser deserialiser = new PostcodeDeserialiser("resources/postcode.json");
    static PostcodeDTO ds = deserialiser.postcodesMapped;

    @Test
    public void statusTest() {
        Assert.assertTrue(Integer.class.isInstance(ds.getStatus()));
    }

    @Test
    public void resultTest() {
        Assert.assertEquals(24, ds.getResult().size());
    }

    @Test
    public void codesTest() {
        Assert.assertEquals(8, ds.getCodes().size());
        Assert.assertEquals("E09000023", ds.getAdmin_district());
    }

    @Test
    public void postCodeTest() {
        Assert.assertNotNull(ds.getPostcode());
        Assert.assertEquals("SE12 0NB", ds.getPostcode());
    }

    @Test
    public void qualityTest() {
        Assert.assertNotNull(ds.getQuality());
        Assert.assertEquals(1, ds.getQuality());
    }

    @Test
    public void eastingsTest() {
        Assert.assertTrue(Integer.class.isInstance(ds.getEastings("eastings")));
        Assert.assertEquals(539962, ds.getEastings("eastings"));
    }

    @Test
    public void northingsTest() {
        Assert.assertTrue(Integer.class.isInstance(ds.getNorthings()));
        Assert.assertEquals(173639, ds.getNorthings());
    }

    @Test
    public void countryTest() {
        Assert.assertEquals("England", ds.getCountry());
    }

    @Test
    public void nhs_haTest() {
        Assert.assertEquals("London", ds.getNhs_ha());
    }

    @Test
    public void longitudeTest() {
        Assert.assertEquals(0.012569d, ds.getLongitude(), 0);
    }

    @Test
    public void latitudeTest() {
        Assert.assertEquals(51.444454d, ds.getLatitude(), 0);
    }

    @Test
    public void europeanTest() {
        Assert.assertEquals("London", ds.getEuropean_electoral_region());
    }

    @Test
    public void primaryTest() {
        Assert.assertEquals("Lewisham", ds.getPrimary_care_trust());
    }

    @Test
    public void parliamentaryTest() {
        Assert.assertEquals("E14000787", ds.getParliamentary_constituency());
    }

    @Test
    public void adminDistrictTest() {
        Assert.assertEquals("E09000023", ds.getAdmin_district());
    }

    @Test
    public void parishTest() {
        Assert.assertEquals("E43000213", ds.getParish());
        Assert.assertEquals("Lewisham, unparished area", ds.getResult().get("parish"));
    }

    @Test
    public void adminCountyTest() {
        Assert.assertEquals("E99999999", ds.getAdmin_county());
    }

    @Test
    public void adminWardTest() {
        Assert.assertEquals("Grove Park", ds.getAdmin_ward());
        Assert.assertEquals("E05000445", ds.getAdmin_ward(ds.getCodes()));
    }

    @Test
    public void cedTest() {
        //Assert.assertNull( ds.getCed());
        Assert.assertEquals("E99999999", ds.getCed());
    }

    @Test
    public void ccgTest() {
        Assert.assertEquals("E38000098", ds.getCcg());
    }

    @Test
    public void nutsTest() {
        Assert.assertEquals("UKI44", ds.getNuts());
    }

}

