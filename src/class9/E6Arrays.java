package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create an array store 10,50,60,45,100 then print elements which
        are present on odd indexes
        excepted out 50,45
         */
        int[] counter={10,50,60,45,100};
        for (int i = 0; i < counter.length; i++) {
            if (i%2!=0){
            System.out.println(counter[i]);
            }

        }
    }
}
