package class9;

public class E2Arrays {
    public static void main(String[] args) {
        /*
        create an array of int and store numbers from 30 40 50 90 inside it
        and access only the number 50
         */

        int[] numbers={30,40,50,90};
        /*
        when we try to access an element using an index which does not exist
         */
       // System.out.println(numbers[20]);
        // ArrayIndexOutOfBoundsException
        //System.out.println(-5);
        System.out.println(numbers[1]);
    }
}
