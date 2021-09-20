package com.example.features.speak;

import com.example.behavior.SpeakBehavior;

public class ChildVoice implements SpeakBehavior {
    @Override
    public void toSpeak() {
        System.out.println("neeeooooo, I'm already aduuult, stop laughing on meeeeeee......");
    }
}
