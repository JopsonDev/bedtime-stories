package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileReader goldy = new FileReader("Goldilocks.txt");
            FileReader hansel = new FileReader("hansel_and_gretel.txt");
            FileReader mary = new FileReader("mary_had_a_little_lamb.txt");
            FileReader selection;
                System.out.print("Which story would you like?\n1). Goldilocks\n2). Hansel and Gretel\n3). Mary had a little lamb\n4). Quit\nChoice: ");
                int input = scanner.nextInt();
                switch (input) {
                    case 1 -> selection = goldy;
                    case 2 -> selection = hansel;
                    case 3 -> selection = mary;
                    case 4 ->  {
                        System.out.println("Thanks have a good one!");
                        return;
                    }
                    default -> {
                        System.out.println("invalid input");
                        return;
                    }
                }
                BufferedReader reader = new BufferedReader(selection);

                String line;
                int i = 1;
                while ((line = reader.readLine()) != null) {
                    System.out.println(i + ". " + line);
                    i++;
                }
                reader.close();
                scanner.close();
                selection.close();


        }catch(Exception a){
            System.out.println("Sorry something went wrong");
        }


    }

}
