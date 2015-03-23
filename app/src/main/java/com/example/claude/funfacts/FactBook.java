package com.example.claude.funfacts;

import java.util.Random;

/**
 * Created by claude on 3/22/15.
 */
public class FactBook {

    public String[] mFunFacts = {"Surprise! You win!",
            "Nice job pressing that button, superstar!",
            "A weasle  is an animal in africa",
            "I am smarter than you",
            "You are tricky to trick",
            "You are tricky to trick too",
            "Treehouse is not actually in a tree"};

    public String getFact(){

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFunFacts.length);
        fact = mFunFacts[randomNumber];

        return fact;
    }
}
