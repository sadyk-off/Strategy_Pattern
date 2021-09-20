package com.example.main;

import com.example.behavior.*;
import com.example.features.fight.JustFight;
import com.example.features.fly.NoFly;
import com.example.features.move.Walk;
import com.example.features.speak.MansVoice;
import com.example.features.temperament.Friendly;
import com.example.features.type.Autobot;

public abstract class Transformer {

    private TemperamentBehavior temperamentBehavior;
    private FightBehavior fightBehavior;
    private SpeakBehavior speakBehavior;
    private MoveBehavior moveBehavior;
    private FlyBehavior flyBehavior;
    private TypeBehavior typeBehavior;


    public Transformer(){
        this(new Friendly(), new JustFight(), new MansVoice(), new Walk(), new NoFly(), new Autobot());
    }
    public Transformer(TemperamentBehavior temperamentBehavior,
                       FightBehavior fightBehavior, SpeakBehavior speakBehavior,
                       MoveBehavior moveBehavior, FlyBehavior flyBehavior, TypeBehavior typeBehavior) {
        this.fightBehavior = fightBehavior;
        this.speakBehavior = speakBehavior;
        this.moveBehavior = moveBehavior;
        this.flyBehavior = flyBehavior;
        this.typeBehavior = typeBehavior;
    }

    public void toFight() {
        this.fightBehavior.toFight();
    }

    public void toFly() {
        this.flyBehavior.fly();
    }

    public void toMove() {
        this.moveBehavior.toMove();
    }

    public void toSpeak() {
        this.speakBehavior.toSpeak();
    }

    public void toShowTemperament() {
        this.temperamentBehavior.behavior();
    }

    public void toShowType() {
        this.typeBehavior.toDisplay();
    }



    public abstract void transform();
}
