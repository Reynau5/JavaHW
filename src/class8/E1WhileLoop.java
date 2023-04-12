package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        // print all numbers from starting point to an ending point
        //ask the user for starting and ending number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter staring number adn ending point and the step");

        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step= scanner.nextInt();
        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number=number+start; //number+=step;
        }
    }
}
