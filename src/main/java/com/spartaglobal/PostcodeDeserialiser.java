package com.spartaglobal;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PostcodeDeserialiser {

    public PostcodeDTO postcodesMapped;

    public PostcodeDeserialiser(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            postcodesMapped = objectMapper.readValue(new File(fileName), PostcodeDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
