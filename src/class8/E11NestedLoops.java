package class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        // use one while and one for loop
        /*
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                if (j%2==0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        int counter=0;
        while (counter<4){
            for (int i = 2; i <=10 ; i=i+2) {
                System.out.print(i+" ");
            }
            System.out.println();
            counter++;
        }

    }
}
