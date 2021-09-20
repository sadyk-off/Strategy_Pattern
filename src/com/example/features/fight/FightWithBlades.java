package com.example.features.fight;

import com.example.behavior.FightBehavior;

public class FightWithBlades implements FightBehavior {
    @Override
    public void toFight() {
        System.out.println("Cut the enemy, squesh vshin vshin...");
    }
}
