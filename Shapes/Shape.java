public class Shape {
    private String name;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Circle", 3.0);
        shapes[1] = new Rectangle("Rectangle", 5.0, 7.0);
        shapes[2] = new Triangle("Triangle", 3.0, 8.0);

        for (Shape shape : shapes) {
            System.out.println(" Area: " + shape.area());
        }
    }
    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0.0;
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }


    public double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }


    public double area() {
        return 0.5 * base * height;
    }
}