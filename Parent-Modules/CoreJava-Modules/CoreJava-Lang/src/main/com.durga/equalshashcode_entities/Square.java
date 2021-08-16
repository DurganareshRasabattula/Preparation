package equalshashcode_entities;

import java.awt.*;

/**
 * @author durga on 8/12/2021
 */
public class Square extends Rectangle{
    private Color color;

    public Square(double width, Color color) {
        super(width, width);
        this.color = color;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Square)) {
            return false;
        }
        Square other = (Square) obj;
        if (color == null) {
            return other.color == null;
        } else return color.equals(other.color);
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }
}
