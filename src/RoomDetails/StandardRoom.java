package RoomDetails;

public class StandardRoom implements RoomFilter{
	private int roomPrice;
	private int availability;
	@Override
	public void roomPrice() {
		System.out.println("Price for Standard Room is Rs 1500");
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available : 2");
	}
	
}
