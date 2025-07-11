package RoomDetails;

public class ClassicRoom implements RoomFilter{
	private int roomPrice;
	private int availability;
	@Override
	public void roomPrice() {
		System.out.println("Price for Classic Room is Rs 2000");
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available : 2");
	}
}
