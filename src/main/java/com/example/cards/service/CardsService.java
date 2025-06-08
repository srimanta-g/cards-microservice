package com.example.cards.service;

import com.example.cards.dto.CardDto;
import com.example.cards.entity.Card;
import com.example.cards.mapper.CardsMapper;
import com.example.cards.repo.ICardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardsService {

    private ICardsRepository iCardsRepository;

    public List<CardDto> getCardsByMobileNumber(String mobileNumber) {
        List<Card> cards = iCardsRepository.findByMobileNumber(mobileNumber);
        return cards.stream().map((CardsMapper::toDto)).toList();
    }
}
