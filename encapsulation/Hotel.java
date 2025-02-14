import java.util.ArrayList;

public class Hotel {
	private ArrayList<Room> rooms;

    {

        void addOccupant(Room room, Customer occupantIn) {
        if (room.occupants.size() < room.size) {
            room.occupants.add(occupantIn);
            occupantIn.changeFeedback(1);
        }
        else {
            occupantIn.feedback--;
            return;
        }
        if (room.clean == true)
            occupantIn.feedback++;
        else
            occupantIn.feedback--;
        room.clean = false;
    }

	
    Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    
    public ArrayList<Room> checkRooms() {
        return this.rooms;
    }
}