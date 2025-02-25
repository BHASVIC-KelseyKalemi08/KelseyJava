import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;


    Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;

        void removeOccupant (Room room, Customer occupantOut){
            int index = -1;
            for (int i = 0; i < room.occupants.size(); i++) {
                if (room.occupants.get(i).equals(occupantOut))
                    index = i;
            }
            if (index != -1)
                room.occupants.remove(index);

        }
    }
}
