package markerinterface;

/**
 * @author durga on 8/12/2021
 */
public class Rectangle implements DeletableShape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }
}
