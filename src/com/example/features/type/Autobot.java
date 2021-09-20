package com.example.features.type;

import com.example.behavior.*;

public class Autobot implements TypeBehavior {


    @Override
    public void toDisplay() {
        System.out.println("I'm an autobot!");
    }
}
