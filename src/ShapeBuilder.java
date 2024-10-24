import java.util.ArrayList;

public class ShapeBuilder {
    static ArrayList<Shape> shapes = new ArrayList<>();

    public static void addShape(Shape s) {
        shapes.add(s);
    }

    public static double getTotalArea() {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        return total;
    }
}
