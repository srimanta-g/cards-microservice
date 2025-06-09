package com.example.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "info")
public record CardsConfigDetailsDto(
        String name,
        String description,
        String version,
        Map<String, String> contact
){
}
