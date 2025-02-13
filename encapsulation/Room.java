import java.util.ArrayList;

public class Room {
    private int number;
    private int size;
    private ArrayList<Customer> occupants;
    private boolean clean;


    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(1, 1, false));
        rooms.add(new Room(2, 2, true));
        rooms.add(new Room(3, 1, false));
        Hotel hotel = new Hotel(rooms);

    }
}

