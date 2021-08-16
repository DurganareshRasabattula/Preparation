package composition;

import java.util.List;

/**
 * @author durga on 8/12/2021
 */
public class Building {
    private String address;
    private List<Room> rooms;

    public class Room {

        public String getBuildingAddress() {
            return Building.this.address;
        }

    }
}
