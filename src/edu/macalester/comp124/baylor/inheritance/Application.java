package edu.macalester.comp124.baylor.inheritance;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application
        extends ConsoleProgram {
    public void run() {
        //--- Old MacDonald had a farm...
        List<Animal> farm = new ArrayList<Animal>();
        Animal a = new Lion();
        farm.add(a);
        a = new TabbyCat();
        farm.add(a);
        a = new Pug();
        farm.add(a);
        a = new Doge();
        farm.add(a);
        a = new Eagle();
        farm.add(a);
        a = new Pigeon();
        farm.add(a);

        //--- We're going to play this game until the user tells us to quit
        println("Welcome to the Old MacDonald guessing game! Guess the animal by doing things to it! (you have 3 guesses)");
        boolean isPlaying = true;
        while (isPlaying) {
            boolean wantToPlay = true;

            //--- Pick an animal at random
            Random dice = new Random();
            int randomAnimal = dice.nextInt(farm.size());
            //--- If you don't remember how to do random numbers,
            //---   Google is your friend. Also, your text book.
            Animal mysteryAnimal = farm.get(randomAnimal);
            int i = 0;

            while (wantToPlay) {
                //--- Ask the user what action they want to take
                println("What do you want to do?");
                println("(1) Pet it");
                println("(2) Give it meat");
                println("(3) Give it chocolate");
                println("(4) Give it carrots");
                println("(5) Walk it");
                println("(6) Wrestle with it");
                println("(7) Pick it up");
                println("(8) Quit");
                println("(Type the number of the action)");

                int userInput;
                do {
                    userInput = readInt();

                    //--- Call the appropriate method on the mystery animal

                    if (userInput == 1) {
                        String result = mysteryAnimal.pet();
                        println(result);
                    } else if (userInput == 2) {
                        String result = mysteryAnimal.giveMeat();
                        println(result);
                    } else if (userInput == 3) {
                        String result = mysteryAnimal.giveChocolate();
                        println(result);
                    } else if (userInput == 4) {
                        String result = mysteryAnimal.giveCarrots();
                        println(result);
                    } else if (userInput == 5) {
                        String result = mysteryAnimal.walk();
                        println(result);
                    } else if (userInput == 6) {
                        String result = mysteryAnimal.wrestle();
                        println(result);
                    } else if (userInput == 7) {
                        String result = mysteryAnimal.pickUp();
                        println(result);
                    } else if (userInput == 8) {
                        wantToPlay = false;
                    } else {
                        println("Please enter a valid number.");
                    }
                }
                while (userInput > 8 && userInput < 1) ;

                if (!wantToPlay) {
                    println("Ok! Thanks for playing!");
                    isPlaying = false;
                    break;
                }

                //--- Ask the user what animal they think this is
                println("What animal? Lion, Tabby Cat, Pug, Doge, Eagle, and Pigeon");
                println("(when guessing - type the names exactly as shown)");
                String userGuess = readLine();
                if (userGuess.equalsIgnoreCase(mysteryAnimal.getSpecies())) {
                    println("You got it! You win!");
                    break;
                }
                if (!userGuess.equalsIgnoreCase(mysteryAnimal.getSpecies())) {
                    println("Try again!");
                }

                i++;

                if (i >= 3) {
                    println("You didn't get it in enough guesses. You lose!");
                    wantToPlay = false;
                }
            }
            if(!isPlaying)
            {
                break;
            }

            println("Do you want to play again? (type true or false)");
            isPlaying = readBoolean();
    }
}
}
