public class Customer {
	private int roomBooking;
	private String name;
	private int feedback;
	
    Customer(int roomBooking, String name) {
        this.roomBooking = roomBooking;
        this.name = name;
        this.feedback = 0;

    }

    public int getRoomBooking() {
        return roomBooking;
    }
    public void increaseFeedback() { feedback++;}
    public void decreaseFeedback() { feedback--;}
    public String getName() {return name;}
    public int getFeedback() {return feedback;}
}