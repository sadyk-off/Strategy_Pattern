package com.example.features.temperament;

import com.example.behavior.TemperamentBehavior;

public class Friendly implements TemperamentBehavior {

    @Override
    public void behavior() {
        System.out.println("Hello, could I help you?");
    }
}
