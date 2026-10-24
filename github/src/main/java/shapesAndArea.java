public class shapesAndArea {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(4, 5), new Circle(1) };
        for (Shape s : shapes) {
            s.describe();
        }
    }
}
