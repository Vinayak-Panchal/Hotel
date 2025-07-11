
public class Booking {
	private String customerId;
	private String roomType;
	private int noOfPax;
	private long totalPrice;
	private int noOfDays;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		 this.customerId = customerId;
	}
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		 this.roomType = roomType;
	}
	
	public int getNoOfPax(){
		return noOfPax;
	}
	public void setNoOfPax(int noOfPax){
		this.noOfPax = noOfPax;
	}
	
	public long getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(long totalprice){
		this.totalPrice = totalprice;
	}
	
	public int getNoOfDays(){
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays){
		this.noOfDays = noOfDays;
	}
}
