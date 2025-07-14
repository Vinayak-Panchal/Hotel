package RoomDetails;
public class Room {
	private RoomType roomType;
	private long price;
	private int vacancy;
	
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public int getVacancy(){
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	
	public Room() {
		this.roomType = roomType;
		this.price = price;
		this.vacancy = vacancy;
	}
	
	public Room(RoomType roomType, long price, int vacancy) {
		this.roomType = roomType;
		this.price = price;
		this.vacancy = vacancy;
	}
}
