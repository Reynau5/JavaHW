package class9;

public class E1Arrays {
    public static void main(String[] args) {
        String name="ELlie";
        String name2="Adrian";
        String name3="Scarlett";

        /*
        String => data type
        [] => this is a part of the syntax
        name => a variable name or name of the array
         = =>assignment operator
         {} => one of the ways to create arrays
         */

        String[] names={"Reyna","Miguel","Annahi"};
        System.out.println(names[0]);
        System.out.println(names[1]);

        /*
        create an array of int and store numbers from 30 40 50 90 inside it
        and access only the number 50
         */

        int[] numbers={30,40,50,90};
        System.out.println(numbers[2]);


    }
}
