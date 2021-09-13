package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 10; i++) {
            Scanner number = new Scanner(System.in);
            int userNumber = number.nextInt();

            if (userNumber > 0 && userNumber < 10) {
                System.out.println("positive single digit number.");

            }
        }
    }
}
