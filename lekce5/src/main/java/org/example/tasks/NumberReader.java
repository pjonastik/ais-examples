package org.example.tasks;

import java.util.Scanner;

public class NumberReader {
    public static int readInt(String message) {
        Scanner reader = new Scanner(System.in);
        int input = 0;
        boolean inputIsNumber = false;

        while (!inputIsNumber) {
            try {
                System.out.print(message);
                String vstupStr = reader.nextLine();
                input = Integer.parseInt(vstupStr);  // try conversion
                inputIsNumber = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input is not number! Please type it again.");
            }
        }
        return input;
    }
}
