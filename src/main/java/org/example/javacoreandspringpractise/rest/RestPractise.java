package org.example.javacoreandspringpractise.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestPractise {
    private static final String TELEGRAM_URL = "https://api.telegram.org/bot%s/sendMessage";


    public void send() {
        String url = String.format(TELEGRAM_URL, "7131451198:AAEPoRg0HS33C1ixkgF-hiLCmOR4elHU9s0");

        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("chat_id", "1355540158");
        requestParams.put("text", "message");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<Map<String, String>> entity = new HttpEntity<>(requestParams, headers);

        RestTemplate restTemplate = new RestTemplate();


        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);


    }

}
