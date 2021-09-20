package com.example.features.fight;

import com.example.behavior.FightBehavior;

public class JustFight implements FightBehavior {
    @Override
    public void toFight() {
        System.out.println("Punch to enemy, rr agh agh...");
    }
}
