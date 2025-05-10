package com.Aniket.Jenkins_Practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruit {
    
    private int id;
    private String name;
    private String color;
}
