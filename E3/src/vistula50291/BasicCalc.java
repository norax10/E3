package vistula50291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalc {
    private static String[] args;

    public static void main(String[] args) throws IOException {
        BasicCalc.args = args;

        float firstNumShah, secondNumShah, sum, subtraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, produce and quotient for two numbers.");
        System.out.println("Type the first number and press Enter:");
        firstNumShah = Float.parseFloat(br.readLine());
        System.out.println("Type the second number and press Enter:");
        secondNumShah= Float.parseFloat(br.readLine());

        sum = firstNumShah + secondNumShah;
        subtraction = firstNumShah - secondNumShah;
        product = firstNumShah * secondNumShah;
        quotient = firstNumShah / secondNumShah;

        System.out.printf(" You entered two numbers, the first is: " + "%2.2f", firstNumShah);
        System.out.printf(" and the second number is: " + "%2.2f", secondNumShah);

        System.out.println(); //blank line
        System.out.printf("sum = " + "%2.2f0, \n", + sum);
        System.out.printf("subtraction = " + "%2.2f0, \n", + subtraction);
        System.out.printf("product = " + "%2.2f0, \n", + product);
        System.out.printf("quotient = " + "%2.2f0, \n", + quotient);


    }
}
