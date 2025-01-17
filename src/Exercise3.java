public class Exercise3 {
    public static void main(String[] args) {

        // Create a sphere object
        Shape3D s1 = new Sphere(6.0);

        // Calculate and print the volume of the sphere
        System.out.println("Volume of Sphere: " + s1.calculateVolume());

        // Calculate and print the surface area of the sphere
        System.out.println("Surface Area of Sphere: " + s1.calculateSurfaceArea());

        // Create a cube object
        Shape3D s2 = new Cube(4.0);

        // Calculate and print the volume of the cube
        System.out.println("Volume of Cube: " + s2.calculateVolume());

        // Calculate and print the surface area of the cube
        System.out.println("Surface Area of Cube: " + s2.calculateSurfaceArea());

    }
}
/*
3.	Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
 Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods
 to calculate the volume and surface area of each shape.
 */

abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();

}

class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

}