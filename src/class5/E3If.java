package class5;

import java.util.Scanner;

public class E3If {
    public static void main(String[] args) {

        /*
        ask the user for the age and based on the value of age
        write an if-else condition if age is <18 print if you can't drive
        otherwise we have to print you can drive
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        if (age<18) {
            System.out.println("you can't drive");
        }
        else{
            System.out.println("you can drive");
        }


    }
}
