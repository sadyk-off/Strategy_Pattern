package com.example.autobots;

import com.example.features.fight.FightWithGuns;
import com.example.features.fly.NoFly;
import com.example.features.move.Walk;
import com.example.features.speak.NoSpeak;
import com.example.features.temperament.Friendly;
import com.example.features.type.Autobot;
import com.example.main.Transformer;

public class Bumblebee extends Transformer {
    public Bumblebee(){
        super(new Friendly(), new FightWithGuns(), new NoSpeak(), new Walk(), new NoFly(), new Autobot());
    }

    @Override
    public void transform() {
        System.out.println("Transform into yellow Chevrolet Camaro....");
    }
}
