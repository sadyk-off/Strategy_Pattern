package com.example.features.fight;

import com.example.behavior.FightBehavior;

public class FightWithGuns implements FightBehavior {
    @Override
    public void toFight() {
        System.out.println("Shooting, ptiu ptiu ptiu...");
    }
}
