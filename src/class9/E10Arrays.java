package class9;

public class E10Arrays {
    public static void main(String[] args) {

        int[] numbers={45,50,20,30,-50,45};
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }
}
