package com.hackathon.eureka;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.hackathon.eureka.loycitizen.vo.Users;

public class TestApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new XmlMapper();
   
        Users users = objectMapper.readValue( StringUtils.toEncodedString(Files.readAllBytes(Paths.get("/users/Users.xml")), StandardCharsets.UTF_8), Users.class);
        System.out.println(users);
    }
}
