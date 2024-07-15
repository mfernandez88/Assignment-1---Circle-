import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Martha Fernandez 
 */
 
 public class MainOne {
     public static void main(String[] args) {
         
         double radius, circumference, area;
         radius = getRadius();
         circumference = calcCirc(radius);
         area = calcArea(radius);
         DecimalFormat df = new DecimalFormat("0.00");
         System.out.println("The circumference of the circle is: " + df.format(circumference));
         System.out.println("The area of the circle is: " + df.format(area));
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
 
     public static double calcCirc(double radius) {
         // Calculate and return value for the circumference
         return 2 * 3.14159 * radius;
     }
 
     public static double calcArea(double radius) {
         // Calculate and return value for the area
         return 3.14159 * radius * radius;
     }
 }
 