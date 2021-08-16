package isinstancevsisassignablefrom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class IsInstanceIsAssignableFromUnitTest {
    
    @Test
    public void whenUsingIsInstanceProperly_desiredResultsHappen() {
        Shape shape = new Triangle();
        Triangle triangle = new Triangle();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        Triangle isoscelesTriangle2 = new IsoscelesTriangle();
        Shape nonspecificShape = null;
        
        assertTrue(shape instanceof Shape);
        assertTrue(triangle instanceof Shape);
        assertTrue(isoscelesTriangle instanceof Shape);
        assertTrue(isoscelesTriangle2 instanceof Shape);
        assertFalse(nonspecificShape instanceof Shape);
        
        assertTrue(shape instanceof Triangle);
        assertTrue(triangle instanceof Triangle);
        assertTrue(isoscelesTriangle instanceof Triangle);
        assertTrue(isoscelesTriangle2 instanceof Triangle);
        
        assertFalse(shape instanceof IsoscelesTriangle);
        assertFalse(triangle instanceof IsoscelesTriangle);
        assertTrue(isoscelesTriangle instanceof IsoscelesTriangle);
        assertTrue(isoscelesTriangle2 instanceof IsoscelesTriangle);
    }
    
    @Test
    public void whenUsingIsAssignableFromProperly_desiredResultsHappen() {
        Shape shape = new Triangle();
        Triangle triangle = new Triangle();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        Triangle isoscelesTriangle2 = new IsoscelesTriangle();
        
        assertFalse(shape.getClass().isAssignableFrom(Shape.class));
        assertTrue(shape.getClass().isAssignableFrom(shape.getClass()));
        assertTrue(shape.getClass().isAssignableFrom(triangle.getClass()));
        assertTrue(shape.getClass().isAssignableFrom(isoscelesTriangle.getClass()));
        assertTrue(shape.getClass().isAssignableFrom(isoscelesTriangle2.getClass()));
        
        assertFalse(triangle.getClass().isAssignableFrom(Shape.class));
        assertTrue(triangle.getClass().isAssignableFrom(shape.getClass()));
        assertTrue(triangle.getClass().isAssignableFrom(triangle.getClass()));
        assertTrue(triangle.getClass().isAssignableFrom(isoscelesTriangle.getClass()));
        assertTrue(triangle.getClass().isAssignableFrom(isoscelesTriangle2.getClass()));
        
        assertFalse(isoscelesTriangle.getClass().isAssignableFrom(Shape.class));
        assertFalse(isoscelesTriangle.getClass().isAssignableFrom(shape.getClass()));
        assertFalse(isoscelesTriangle.getClass().isAssignableFrom(triangle.getClass()));
        assertTrue(isoscelesTriangle.getClass().isAssignableFrom(isoscelesTriangle.getClass()));
        assertTrue(isoscelesTriangle.getClass().isAssignableFrom(isoscelesTriangle2.getClass()));
        
        assertFalse(isoscelesTriangle2.getClass().isAssignableFrom(Shape.class));
        assertFalse(isoscelesTriangle2.getClass().isAssignableFrom(shape.getClass()));
        assertFalse(isoscelesTriangle2.getClass().isAssignableFrom(triangle.getClass()));
        assertTrue(isoscelesTriangle2.getClass().isAssignableFrom(isoscelesTriangle.getClass()));
        assertTrue(isoscelesTriangle2.getClass().isAssignableFrom(isoscelesTriangle2.getClass()));
    }

}
