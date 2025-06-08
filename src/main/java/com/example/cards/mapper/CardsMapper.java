package com.example.cards.mapper;

import com.example.cards.dto.CardDto;
import com.example.cards.entity.Card;

public class CardsMapper {
    public static CardDto toDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardType(card.getCardType());
        cardDto.setBalance(card.getBalance());
        cardDto.setMobileNumber(card.getMobileNumber());
        return cardDto;
    }
    public static Card toEntity(CardDto cardDto) {
        Card card = new Card();
        card.setCardNumber(cardDto.getCardNumber());
        card.setCardType(cardDto.getCardType());
        card.setBalance(cardDto.getBalance());
        card.setMobileNumber(cardDto.getMobileNumber());
        return card;
    }
}
