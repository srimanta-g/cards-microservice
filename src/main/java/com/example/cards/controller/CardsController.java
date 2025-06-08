package com.example.cards.controller;

import com.example.cards.dto.CardDto;
import com.example.cards.entity.Card;
import com.example.cards.mapper.CardsMapper;
import com.example.cards.repo.ICardsRepository;
import com.example.cards.service.CardsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@AllArgsConstructor
@NoArgsConstructor
public class CardsController {

    private CardsService cardsService;
    private ICardsRepository iCardsRepository;

    @Value("${custom.env}")
    private String environmentType;

    @PostMapping("/create")
    public ResponseEntity<CardDto> createCard(@RequestBody CardDto cardDto) {
        Card savedCard = this.iCardsRepository.save(CardsMapper.toEntity(cardDto));
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(CardsMapper.toDto(savedCard));
    }

    @GetMapping("/details/{mobileNumber}")
    public ResponseEntity<List<CardDto>> getCardDetailsFromMobileNumber(@PathVariable String mobileNumber) {
        return ResponseEntity.ok(this.cardsService.getCardsByMobileNumber(mobileNumber));
    }

    @GetMapping("/get-config-details")
    public ResponseEntity<String> getConfigDetails() {
        return ResponseEntity.status(200).body(environmentType);
    }
}
