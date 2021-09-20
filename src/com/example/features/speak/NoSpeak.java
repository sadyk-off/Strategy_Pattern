package com.example.features.speak;

import com.example.behavior.SpeakBehavior;

public class NoSpeak implements SpeakBehavior {
    @Override
    public void toSpeak() {
        System.out.println("..........");
    }
}
