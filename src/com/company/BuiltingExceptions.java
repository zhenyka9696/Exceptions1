package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltingExceptions {
    public static void main(String[] args) {
        //proccessDivisionByZero();
        //InputStream is = new FileInputStream()
        processInputException();
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println("Null pointer");
        }
        s = "1.2";
        try {
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.err.println("Wrong format of the number");
        }
    }
    static  void processInputException(){
        Scanner scanner = new Scanner(
                System.in
        );
        boolean state;
        int a = 0;
        do {
            try {
                state = false;
                System.out.println("Enter an integer number");
                        a = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong format of the number!");
                scanner.nextLine();
                state = true;
            }
        }
        while (state);
        System.out.printf("a=%d%n",a);
    }
}
