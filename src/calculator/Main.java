package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner newObj = new Scanner(System.in);
        System.out.println("--------------------------");

        System.out.println("Please enter value for X: ");
        float x = newObj.nextFloat();

        System.out.println("Please enter value for Y: ");
        float y = newObj.nextFloat();

        System.out.println("Result of sum: " + (x+y));

        newObj.close();

    }
}