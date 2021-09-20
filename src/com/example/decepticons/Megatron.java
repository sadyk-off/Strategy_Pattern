package com.example.decepticons;

import com.example.features.fight.FightWithGuns;
import com.example.features.fly.FlyWithRocketJet;
import com.example.features.move.Walk;
import com.example.features.speak.MansVoice;
import com.example.features.temperament.Evil;
import com.example.features.type.Decepticon;
import com.example.main.Transformer;

public class Megatron  extends Transformer {
    public Megatron(){
        super(new Evil(), new FightWithGuns(), new MansVoice(), new Walk(), new FlyWithRocketJet(), new Decepticon());
    }

    @Override
    public void transform() {
        System.out.println("Transform into starship....");
    }
}
