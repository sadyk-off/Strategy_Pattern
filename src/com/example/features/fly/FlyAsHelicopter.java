package com.example.features.fly;

import com.example.behavior.FlyBehavior;

public class FlyAsHelicopter implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Transform into helicopter and fly up from here");
    }
}
