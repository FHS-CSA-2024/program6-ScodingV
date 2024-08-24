//import Scanner input utility
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
      // initialize the variables
        Scanner valInp = new Scanner(System.in);
      //initializes a final, permanently defined variable for pi
        final double pi = 3.14159;
        double radius = 0;
        double diameter = 0.0;
        double circumference = 0;
        double area = 0;

        //outputs the radius
        System.out.println("Enter the radius: ");
        radius = valInp.nextDouble();
        System.out.printf("The Radius of the circle = %, .3f\n\n", radius);
        
        //outputs the diameter
        diameter = radius * 2;
        System.out.printf("The Diameter of the circle = %, .3f\n\n", (diameter));
        //outputs the area
        area = pi*(radius*radius);
        System.out.printf("The Area of the circle = %, .3f\n\n", area);
        //outputs the circumference
        circumference = 2 * radius * pi;
        System.out.printf("The Circumference of the circle = %, .3f\n\n", circumference);
        
    }
}
/*
Sample Output:
Enter the radius:

3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 41.337

The Circumference of the circle = 22.272 
*/
