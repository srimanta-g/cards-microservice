package com.example.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CardDto {
    private String cardNumber;
    private String cardType;
    private double balance;
    private String mobileNumber;
}
