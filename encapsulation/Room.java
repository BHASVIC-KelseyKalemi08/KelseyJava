import java.util.ArrayList;

public class Room {
    private int number;
    private int size;
    private ArrayList<Customer> occupants;
    private boolean clean;

    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.clean = clean;
        this.occupants = new ArrayList<Customer>();
    }

    void addOccupant( Customer occupantIn) {
        if (occupants.size() < size) {
            occupants.add(occupantIn);
            occupantIn.increaseFeedback();
        }
        else {
            occupantIn.decreaseFeedback();
            return;
        }
        if (clean == true)
            occupantIn.increaseFeedback();
        else
            occupantIn.decreaseFeedback();
        clean = false;
    }

    void removeOccupant( Customer occupantOut) {
        int index = -1;
        for (int i = 0; i < occupants.size(); i++) {
            if (occupants.get(i).equals(occupantOut))
                index = i;
        }
        if (index != -1)
            occupants.remove(index);
    }





    ArrayList<Customer> getOccupants() {return occupants;}
    int getSize() {return size;}
    boolean getCleanliness() {return clean;}
    void setCleanliness(boolean cleanliness){clean = cleanliness;}

    int getNumber() {return number;}

}


