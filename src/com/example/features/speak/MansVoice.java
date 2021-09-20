package com.example.features.speak;

import com.example.behavior.SpeakBehavior;

public class MansVoice implements SpeakBehavior {
    @Override
    public void toSpeak() {
        System.out.println("GRRR ManHood voice!");
    }
}
