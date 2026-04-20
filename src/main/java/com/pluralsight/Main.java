package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {

            BufferedReader goldilocksReader = new BufferedReader(new FileReader("goldilocks.txt"));
            BufferedReader hanselReader = new BufferedReader(new FileReader("hansel_and_gretel.txt"));
            BufferedReader maryReader = new BufferedReader(new FileReader("mary_had_a_little_lamb.txt"));

        } catch (FileNotFoundException ex) {
            System.out.println("Something went wrong.");
        }

    }
}
