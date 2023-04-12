package class8;

public class E10NestedForLoop {
    public static void main(String[] args) {
        /*
        # # # # # 5 times
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
