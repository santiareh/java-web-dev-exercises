package exercises;
import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How much gas did you use?");
        Double gas = input.nextDouble();
        System.out.println("The miles-per-gallon is: " + miles / gas);
    }
}
