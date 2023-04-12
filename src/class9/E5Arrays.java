package class9;

public class E5Arrays {
    public static void main(String[] args) {
        /*
        write a loop that starts from 0 and it goes till the number 5 and print
        only the even numbers.

        create an array of char, and you have to print all the char on even indexes
         */
        int [] counter={0,1,2,3,4,5};
        for (int i = 0; i <=5; i++) {
            if (i%2==0) {
                System.out.println(counter[i]);
            }
        }
        char [] chars={'A','B','C','D','E'};
        for (int i = 0; i < 5; i+=2) {

                System.out.println(chars[i]);

        }


    }
}
