package class2;

public class Variables {
    public static void main(String[] args) {
        String name = "Reyna";
        String lastName = "Umanzor";
        char grade = 'A';
        String city = "Sterling";
        String state = "Virginia";
        String phoneNumber = "703-989-9898";
        System.out.println("My name is " + name + " and my last name is " + lastName);
        System.out.println("I am " + grade + " student");
        System.out.println("I live in " + city + ", " + state);
        System.out.println("And my phone number is " + phoneNumber);

        System.out.println("--------------------------------------------------------");
        city = "Miami";
        state = "Florida";
        phoneNumber = "703-555-7777";
        grade = 'B';
        System.out.println("My name is " + name + " I moved to " + city + ", " + state);
        System.out.println("My new phone number is " + phoneNumber);
        System.out.println("I am "+grade+" student");


    }
}
