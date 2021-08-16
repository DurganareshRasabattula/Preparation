package markerinterface;

/**
 * @author durga on 8/12/2021
 */
public class ShapeDao {
    public boolean delete(Object object) {
        return object instanceof DeletableShape;
        // Calling the code that deletes the entity from the database
    }
}
