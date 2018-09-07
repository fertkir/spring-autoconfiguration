package com.example.autoconfig.library;

import org.springframework.web.client.RestTemplate;

public class HttpClient {

    private final String url;
    private final RestTemplate restTemplate;

    public HttpClient(String url, RestTemplate restTemplate) {
        this.url = url;
        this.restTemplate = restTemplate;
    }

    public String get() {
        return restTemplate.getForObject(url, String.class);
    }
}
