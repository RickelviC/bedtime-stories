package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {

            BufferedReader goldilocksReader = new BufferedReader(new FileReader("goldilocks.txt"));
            BufferedReader hanselReader = new BufferedReader(new FileReader("hansel_and_gretel.txt"));
            BufferedReader maryReader = new BufferedReader(new FileReader("mary_had_a_little_lamb.txt"));

            System.out.println("Enter the name of a story: ");
            String userinput = scanner.nextLine();

            if (userinput.equalsIgnoreCase("goldilocks.txt")) {
                String input;
                while ((input = goldilocksReader.readLine()) != null) {
                    System.out.println(input);
                }
                goldilocksReader.close();
            } else if (userinput.equalsIgnoreCase("hansel_and_gretel.txt")) {
                String input;
                while ((input = hanselReader.readLine()) != null) {
                    System.out.println(input);
                }
            } else if (userinput.equalsIgnoreCase("mary_had_a_little_lamb.txt")) {
                String input;
                while ((input = maryReader.readLine()) != null) {
                    System.out.println(input);
                }
            }else {
                System.out.println("not an option");
            }


        } catch (IOException ex) {
            System.out.println("Something went wrong.");
            scanner.close();
        }
    }
}
