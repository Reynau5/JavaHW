package Homework;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the loan amount needed");

        int loan= scanner.nextInt();
        if (loan<=200000) {
            System.out.println("Your loan is Approved");
        } else {
            System.out.println("Your loan is Denied");
        }
    }
}
