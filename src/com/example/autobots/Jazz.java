package com.example.autobots;

import com.example.features.fight.FightWithGuns;
import com.example.features.fly.NoFly;
import com.example.features.move.Walk;
import com.example.features.speak.MansVoice;
import com.example.features.temperament.Friendly;
import com.example.features.type.Autobot;
import com.example.main.Transformer;

public class Jazz  extends Transformer {
    public Jazz(){
        super(new Friendly(), new FightWithGuns(), new MansVoice(), new Walk(), new NoFly(), new Autobot());
    }

    @Override
    public void transform() {
        System.out.println("Transform into pick up «GMC Topkick» C4500....");
    }
}
