import java.util.Scanner;

public class Shapecalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape Calculator");

        Shape[] shapes = new Shape[3];
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        shapes[0] = new Circle(radius);
        System.out.println("Enter rectangle width:");
        double rectWidth = scanner.nextDouble();
        System.out.println("Enter rectangle height:");
        double rectHeight = scanner.nextDouble();
        shapes[1] = new Rectangle(rectWidth, rectHeight);
        System.out.println("Enter triangle base:");
        double base = scanner.nextDouble();
        System.out.println("Enter rectangle height:");
        double height = scanner.nextDouble();
        shapes[2] = new Triangle(base, height);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of Circle with radius " + ((Circle) shape).getRadius() + ": " + shape.calculateArea() + ", Color:" + shape.color);
            } else if (shape instanceof Rectangle) {
                System.out.println("Area of Rectangle with width " + ((Rectangle) shape).getWidth() +
                        " and height " + ((Rectangle) shape).getHeight() + ": " + shape.calculateArea() + ", Color:" + shape.color);
            } else if (shape instanceof Triangle) {
                System.out.println("Area of Triangle with base " + ((Triangle) shape).getBase() +
                        " and height " + ((Triangle) shape).getHeight() + ": " + shape.calculateArea() + ", Color:" + shape.color);
            }
        }
    }
}