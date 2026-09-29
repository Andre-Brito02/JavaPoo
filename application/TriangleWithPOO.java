package application;
import entities.Triangle;

public class TriangleWithPOO {
    static void main() {
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        IO.println("Enter the measures of triangle x: ");
        x.a = Double.parseDouble(IO.readln());
        x.b = Double.parseDouble(IO.readln());
        x.c = Double.parseDouble(IO.readln());

        IO.println("Enter the measures of triangle y: ");
        y.a = Double.parseDouble(IO.readln());
        y.b = Double.parseDouble(IO.readln());
        y.c = Double.parseDouble(IO.readln());

        double areaX = x.area();
        double areaY = y.area();

        IO.println("Triangle X area: %.4f".formatted(areaX));
        IO.println("Triangle Y area: %.4f".formatted(areaY));

        if (areaX > areaY) {
            IO.println("Larger Area: X");
        } else {
            IO.println("Larger Area: Y");
        }
    }
}