
public class Room {
	private String roomType;
	private long price;
	private int vacancy;
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
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
	
	public Room(String roomType, long price, int vacancy) {
		this.roomType = roomType;
		this.price = price;
		this.vacancy = vacancy;
	}
}
