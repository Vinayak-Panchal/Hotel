package RoomDetails;

public class ClassicRoom implements RoomFilter{
	private int roomPrice;
	private int availability;
	
	RoomData roomdata = new RoomData();
	
	@Override
	public void roomPrice() {
		System.out.println("Price for Classic Room is");
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available : 2");
	}
}
