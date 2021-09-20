package com.example.decepticons;

import com.example.features.fight.FightWithGuns;
import com.example.features.fly.NoFly;
import com.example.features.move.Walk;
import com.example.features.speak.MansVoice;
import com.example.features.temperament.Evil;
import com.example.features.type.Decepticon;
import com.example.main.Transformer;

public class Barricade  extends Transformer {
    public Barricade(){
        super(new Evil(), new FightWithGuns(), new MansVoice(), new Walk(), new NoFly(), new Decepticon());
    }

    @Override
    public void transform() {
        System.out.println("Transform into police car «Saleen S281»....");
    }
}
