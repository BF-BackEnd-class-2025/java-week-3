import java.util.List;

public class SealedDemo {
    sealed interface Shape permits Circle, Rectangle, Polygon {
    }

    static final class Circle implements Shape {
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double radius() {
            return radius;
        }
    }

    static final class Rectangle implements Shape {
        private final double width;
        private final double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double width() {
            return width;
        }

        double height() {
            return height;
        }
    }

    static non-sealed class Polygon implements Shape {
        private final int sides;

        Polygon(int sides) {
            this.sides = sides;
        }

        int sides() {
            return sides;
        }
    }

    static final class Triangle extends Polygon {
        Triangle() {
            super(3);
        }
    }

    static String describe(Shape shape) {
        if (shape instanceof Circle c) {
            return "Circle radius=" + c.radius();
        }
        if (shape instanceof Rectangle r) {
            return "Rectangle " + r.width() + "x" + r.height();
        }
        if (shape instanceof Polygon p) {
            return "Polygon sides=" + p.sides();
        }
        return "Unknown";
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(2.5),
                new Rectangle(3, 4),
                new Triangle()
        );

        for (Shape shape : shapes) {
            System.out.println(describe(shape));
        }
    }
}
