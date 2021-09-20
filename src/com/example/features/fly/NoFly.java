package com.example.features.fly;

import com.example.behavior.FlyBehavior;

public class NoFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("You know that I cannot fly!");
    }


}
