public class Receptionist {
    private String name;
	private String hotel;
	private String addOccupant;
	private String removeOccupant;
    
	Receptionist(String name) {
        this.name = name;
	}
	void checkIn( Hotel hotel, Customer customer) {
		hotel.addOccupant(hotel.get(customer.getRoomBooking() - 1), customer);
		System.out.println(name + " checked in " + customer.getName());
	}

	void checkOut( Hotel hotel, Customer customer, Manager manager) {
		removeOccupant(hotel.get(customer.getRoomBooking() - 1), customer);
		System.out.println(name + " checked out " + customer.getName());
		manager.takeFeedback(manager, customer);
	}

}
