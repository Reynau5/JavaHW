package class5;

import java.util.Scanner;

public class E5LogicalOperators {
    public static void main(String[] args) {

        /*
        NOT ! it flips the boolean values for example if the value is true
        it will change it to false and if it is false it change it true
         */
        Scanner scanner = new Scanner(System.in);
        boolean flag= scanner.nextBoolean();

        // ! operator will reverse the condition and it will get printed
        System.out.println(!flag);
        System.out.println(flag);


        String name="Semir";
        // only works with boolean data type
        // System.out.println(!name);
    }

}
