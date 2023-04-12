package class4;

import java.util.Scanner;

public class replit32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = scanner.next().charAt(0);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (gender == 'F') {
            if (age >= 25) {
                System.out.println("Women");
            } else {
                System.out.println("girl");
            }

        } else if (gender=='M')
        {
            if (age >= 25) {
                System.out.println("man");
            } else {
                System.out.println("boy");
            }
        }}

    }





