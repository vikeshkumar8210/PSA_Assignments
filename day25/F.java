package day25;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i; // Declare i outside of the for loop
        for (i = 0; i < 3; i++) { // Remove the semicolon and add curly braces
            System.out.println("Enter the Pincode");
            int pincode = scan.nextInt();
            if (pincode == 8210) {
                System.out.println("Welcome");
                break; // Exit the loop
            } else {
                System.out.println("Invalid pin number");
                if (i == 2) {
                    System.out.println("Phone is locked!!");
                }
            }
        }
    }
}
