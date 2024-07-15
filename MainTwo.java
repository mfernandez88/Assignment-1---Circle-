import java.util.Scanner;
import java.text.DecimalFormat;

public class MainTwo {
    public static void main(String[] args) {
        // Call helper (class) method to input the radius
        double radius = getRadius();

        // Instantiate the Circle object
        Circle circle = new Circle(radius);

        // Format the output to show two decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        // Output the circumference and area using instance methods
        System.out.println("The circumference of the circle is: " + df.format(circle.getCircumference()));
        System.out.println("The area of the circle is: " + df.format(circle.getArea()));
    }

    public static double getRadius() {
        // Define a local radius variable
        double radius;
        Scanner scanner = new Scanner(System.in);

        // Read in a value for radius
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Return the value
        return radius;
    }
}
