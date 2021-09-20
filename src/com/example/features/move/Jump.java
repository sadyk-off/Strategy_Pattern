package com.example.features.move;

import com.example.behavior.MoveBehavior;

public class Jump implements MoveBehavior {
    @Override
    public void toMove() {
        System.out.println("jump up, and up, and up....");
    }
}
