public class Shape {
    private String name;

    Shape(String name) { this.name = name; }

    double area() {
        return 0;
    }

    void describe() {
        System.out.println(name + " has area " + area());
    }
}

class Rectangle extends Shape {
    private double width, height;

    Rectangle(double w, double h) {
        super("Rectangle");
        width = w;
        height = h;
    }

    @Override
    double area() { return width * height; }
}

class Circle extends Shape {
    private double radius;

    Circle(double r) {
        super("Circle");
        radius = r;
    }

    @Override
    double area() { return Math.PI * radius * radius; }
}


