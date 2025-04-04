import java.util.Scanner;
public class AreaCalculator 
{
    public double calculateArea(double radius) 
    {
        return Math.PI * radius * radius;
    }
    public  double calculateArea(double length, double width)
    {
        return length * width; 
    }    
    public double calculateTriangleArea(double base, double height) 
    {
        return 0.5 * base * height; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println(" CRICLE ");
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculator.calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);
        
        System.out.println("\n RECTANGLE ");
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = calculator.calculateArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println(" \nTRIANGLE ");
        System.out.println("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculator.calculateArea(base, height);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
