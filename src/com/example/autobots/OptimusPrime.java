package com.example.autobots;

import com.example.features.fight.FightWithBlades;
import com.example.features.fly.NoFly;
import com.example.features.move.Walk;
import com.example.features.speak.MansVoice;
import com.example.features.temperament.Friendly;
import com.example.features.type.Autobot;
import com.example.main.Transformer;

public class OptimusPrime extends Transformer {

    public OptimusPrime(){
        super(new Friendly(), new FightWithBlades(), new MansVoice(), new Walk(), new NoFly(), new Autobot());
    }

    @Override
    public void transform() {
        System.out.println("Transform into the Track....");
    }
}
