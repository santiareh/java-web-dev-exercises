package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the rectangle width?");
        Double width = input.nextDouble();
        System.out.println("What is the rectangle height?");
        Double height = input.nextDouble();
        System.out.println("The area of the rectangle is: " + width * height);
    }
}
