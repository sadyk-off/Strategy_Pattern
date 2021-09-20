package com.example.features.move;

import com.example.behavior.MoveBehavior;

public class Walk implements MoveBehavior {
    @Override
    public void toMove() {
        System.out.println("first step forward , and second step forward....");
    }
}
