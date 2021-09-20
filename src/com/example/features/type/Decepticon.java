package com.example.features.type;

import com.example.behavior.TypeBehavior;

public class Decepticon implements TypeBehavior {


    @Override
    public void toDisplay() {
        System.out.println("I'm a decepticon!");
    }
}
