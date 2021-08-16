package interfaces_polymorphysim;

import java.util.ArrayList;
import java.util.List;

/**
 * @author durga on 8/11/2021
 */
public class MainTestClass {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape circleShape = new Circle();
        Shape squareShape = new Square();

        shapes.add(circleShape);
        shapes.add(squareShape);

        for (Shape shape : shapes) {
            System.out.println(shape.name());
        }
    }
}
