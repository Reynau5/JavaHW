package Homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your city");
        String city= scanner.nextLine();
        System.out.println("What is the Temperature in Fahrenheit");
        int temp = scanner.nextInt();
        int celsius = (temp-32)* 5/9;
        System.out.println("The Temperature in "+city+" is "+celsius+"C");

        }


    }

