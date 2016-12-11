package com.sd.game;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    private final Random rand;
    private final int faces;

    public Dice(int faces) {
        this.rand = new Random();
        this.faces = faces;
    }

    public int roll() {
        return rand.nextInt(faces) + 1;
    }
    public static void main(String []args) {
    	Scanner input = new Scanner(System.in);

    	System.out.println("Dice Roller\n");
    	System.out.println("How many faces does the dice have?");
    	Dice dice = new Dice(input.nextInt());
    	System.out.println("\nThe dice rolled a " + dice.roll() + ".");
	}
}