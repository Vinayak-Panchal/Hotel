package RoomDetails;

public class NonAc implements RoomFilter {
	private int roomPrice;
	private int availability;
	@Override
	public void roomPrice() {
		System.out.println("Price for Non Ac Room Room is Rs 1000");
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available : 2");
	}
}
