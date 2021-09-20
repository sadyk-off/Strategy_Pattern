package com.example.decepticons;

import com.example.features.fight.FightWithGuns;
import com.example.features.fly.NoFly;
import com.example.features.move.NoMove;
import com.example.features.speak.ChildVoice;
import com.example.features.temperament.Evil;
import com.example.features.type.Decepticon;
import com.example.main.Transformer;

public class Frenzy extends Transformer {
    public Frenzy(){
        super(new Evil(), new FightWithGuns(), new ChildVoice(), new NoMove(), new NoFly(), new Decepticon());
    }

    @Override
    public void transform() {
        System.out.println("Transform into mobile phone....");
    }
}
