import java.util.ArrayList;

public class Receptionist {
    private String name;
	private String hotel;
	private String addOccupant;
	private String removeOccupant;
    
	Receptionist(String name) {
        this.name = name;
	}

	void checkIn(Hotel hotel, Customer customer) {
		ArrayList<Room> roomList = hotel.checkRooms(); //get list of rooms
		int roomBooking = customer.getRoomBooking() - 1; //get customer room booking info
		Room checkInRoom = roomList.get(roomBooking); //get booked room from list
		checkInRoom.addOccupant(customer); //add customer to room
		System.out.println(name + " checked in " + customer.getName()); //print some nonsense
	}

	void checkOut(Hotel hotel, Customer customer, Manager manager) {
		ArrayList<Room> roomList = hotel.checkRooms();//get list of rooms
		int roomBooking = customer.getRoomBooking() - 1;//get customer room booking info
		Room checkInRoom = roomList.get(roomBooking);//get booked room from list
		checkInRoom.removeOccupant(customer);//remove customer from the room
		System.out.println(name + " checked out " + customer.getName());//print some nonsense
		manager.takeFeedback(customer);//manager feedback
	}

}
