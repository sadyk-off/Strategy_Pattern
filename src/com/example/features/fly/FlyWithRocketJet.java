package com.example.features.fly;

import com.example.behavior.FlyBehavior;

public class FlyWithRocketJet implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Transform into fighter jet, and throw reactive jet");
    }
}
