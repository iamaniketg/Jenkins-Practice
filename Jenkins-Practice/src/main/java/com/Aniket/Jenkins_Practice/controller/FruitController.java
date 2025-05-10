package com.Aniket.Jenkins_Practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aniket.Jenkins_Practice.model.Fruit;
import com.Aniket.Jenkins_Practice.service.FruitService;

@RestController
public class FruitController {
    private final FruitService fruitService;
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/getFruits")
    public Fruit getFruits() {
        return fruitService.getFruits();
    }
}
