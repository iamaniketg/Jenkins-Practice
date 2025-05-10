package com.Aniket.Jenkins_Practice.service;

import org.springframework.stereotype.Service;
import com.Aniket.Jenkins_Practice.model.Fruit;
@Service
public class FruitServiceImpl implements FruitService {

    @Override
    public Fruit getFruits() {
        Fruit fruit = new Fruit();
        fruit.setId(1);
        fruit.setName("Apple");
        fruit.setColor("Red");
        return fruit;
    }

    
}
