package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input2.nextDouble();
        double num3 = input3.nextDouble();
        smallestOfThreeNumbers(num1,num2,num3);
    }
    public static void smallestOfThreeNumbers(double num1, double num2, double num3) {
        if(num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest");
        } else if(num2 < num3 && num2 < num1) {
            System.out.println(num2 + " is the smallest");
        }else if(num3 < num1 && num3 < num2) {
            System.out.println(num3 + " is the smallest");
        } else {
            System.out.println("the numbers are equal");
        }
    }
}
