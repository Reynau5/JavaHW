package Homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is you age");

        int age= scanner.nextInt();
        if (age>=18){
            System.out.println("You will be issued a drivers license");
        } else {
            System.out.println("You will be issued a learners permit");
        }

    }
}
