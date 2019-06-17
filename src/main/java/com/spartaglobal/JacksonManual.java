package com.spartaglobal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonManual {
    private JsonNode rootJSON;

    public JacksonManual(String fileName){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            rootJSON = objectMapper.readTree(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
