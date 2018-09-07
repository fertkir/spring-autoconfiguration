package com.example.autoconfig.test;

import com.example.autoconfig.library.HttpClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    @Profile("custom-bean")
    public HttpClient httpClient() {
        return new HttpClient("http://vc.ru", new RestTemplate());
    }

    @Bean
    public CommandLineRunner runner(HttpClient httpClient) {
        return args -> System.out.println(httpClient.get());
    }
}
