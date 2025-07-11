package RoomDetails;

public class DoubleBedRoom implements RoomFilter {
	private int roomPrice;
	private int availability;
	@Override
	public void roomPrice() {
		System.out.println("Price for Double Bed Room Room is Rs 2500");
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available : 2");
	}
}
