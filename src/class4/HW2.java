package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        prompt the user to enter person heights in inches. person should be classified as one of the following:
        -short (under 60 inch)
        -medium (between 60-72 inch)
        - tall (over 72 inch)
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your height in inches?");
        int inch= scanner.nextInt();
        if (inch<60) {
            System.out.println("Short");
        } else if (inch<=72) {
            System.out.println("medium");
        } else if (inch>=72) {
            System.out.println("tall");

        }
    }


}
