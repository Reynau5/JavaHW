package class9;

public class E12Arrays {
    public static void main(String[] args) {

      /*
        numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;

       */


        int[] numbers= new int[5];
int num=50;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i]=num;
            num=num+10;
        }
        for (int number : numbers){
            System.out.println(number);
        }

    }
}
