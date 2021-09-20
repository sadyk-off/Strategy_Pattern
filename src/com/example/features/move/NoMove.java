package com.example.features.move;

import com.example.behavior.MoveBehavior;

public class NoMove implements MoveBehavior {
    @Override
    public void toMove() {
        System.out.println("I'm like a stone, and I'm also so lazy....");
    }
}
