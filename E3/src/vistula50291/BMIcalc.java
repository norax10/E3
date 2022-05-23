package vistula50291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMIcalc {
    public static void main(String[] args) throws IOException {
        float height, weight, BMI;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate BMI");
        System.out.println("Enter your height in cm and press enter:");
        height = Float.parseFloat(br.readLine());
        System.out.println("Enter your weight and press enter:");
        weight = Float.parseFloat(br.readLine());

        BMI = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("Your BMI is:  " + "%2.2f, \n", BMI);

        if (BMI<16) {
            System.out.println("You are starving");
        } else if ((BMI>=16)&&(BMI < 16.99)) {
            System.out.printf("You are emaciated");
        } else if ((BMI>=17)&&(BMI < 18.49)) {
            System.out.printf("You are underweight");
        } else if ((BMI>=18.50)&&(BMI < 22.99)) {
            System.out.printf("You are in the low range of the norm");
        } else if ((BMI>=23)&&(BMI < 24.99)) {
            System.out.printf("You are in the high range of the norm");
        } else if ((BMI>=25)&&(BMI < 27.49)) {
            System.out.printf("You are overweight (pre-obese)");
        } else if ((BMI>=27.50)&&(BMI < 29.99)) {
            System.out.printf("You are overweight");
        } else if ((BMI>=30)&&(BMI < 34.99)) {
            System.out.printf("You have 1st degree obesity");
        } else if ((BMI>=35)&&(BMI < 39.99)) {
            System.out.printf("You have 2nd degree obesity");
        } else if ((BMI>40)){
            System.out.printf("You have 3rd degree obesity");
        }
    }
}
