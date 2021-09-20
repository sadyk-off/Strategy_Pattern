package com.example.features.temperament;

import com.example.behavior.TemperamentBehavior;

public class Evil implements TemperamentBehavior {
    @Override
    public void behavior() {
        System.out.println("rrrrrhhh, I'm very evil....");
    }
}
