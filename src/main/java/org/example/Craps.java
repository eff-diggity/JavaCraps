package org.example;

import java.util.Random;

public class Craps {
    public static void main(String[] args) {
        System.out.println("Let's roll some dice!\n🤑🤑🤑🤑🤑🤑🤑🤑🤑🤑🤑🤑🤑");

//        String[] diceFacesArray = {" * ", "* \n  *", "*\n *\n  *", "* *\n* *", "* *\n * \n* *", "* *\n* *\n* *"};
int firstDie = rollOne(6);
//System.out.println("first die =" +firstDie);
int secondDie = rollTwo();
//        System.out.println("secondDie = " + secondDie);

int diceTotal = firstDie + secondDie; // firstDie +secondDie
//System.out.println(diceTotal);

System.out.println("You rolled " + firstDie + " and " + secondDie + " for a total of " + diceTotal + ".");
        if (diceTotal == 7 || diceTotal == 11) {
            System.out.println("You Win!!!");
        } else if (diceTotal < 7 || diceTotal > 7 || diceTotal == 12) {
            System.out.println("Craps! 🙁");
        }
    }
//        System.out.println("You rolled \n" +  diceFacesArray[rollOne(6)] / + /(rollOne(6) + 1) + " \nand\n " + diceFacesArray[rollTwo()] + (rollTwo() + 2) + "\n for a total of " + sumOfRoll() + ".");

    public static int rollOne(int x) {
//        using simple random number generator
        return (int) (Math.floor(Math.random() * x) + 1);
    }

    public static int rollTwo() {
//        using Random class
        Random randomDieRoll = new Random();
        int upper = 6;
        int dieTwo = randomDieRoll.nextInt(upper) + 1;
//        System.out.println("die two = " + dieTwo);

        return dieTwo;
    }




}

