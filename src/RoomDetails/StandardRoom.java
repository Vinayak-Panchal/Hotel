package RoomDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Booking.ConfirmBooking;

public class StandardRoom implements RoomFilter{
	RoomData roomdata = new RoomData();
	ConfirmBooking confirmBooking = new ConfirmBooking();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	private int roomPrice;
	private int availability;
	private int days;
	private int pax;
	
	public int getroomPrice() {
		return roomdata.roomPriceData.get("Standard Room");
	}
	@Override
	public void roomPrice() {
		
		System.out.println("Price for Standard Room is Rs "+roomdata.roomPriceData.get("Standard Room"));
	}
	@Override
	public void roomAvailability() {
		System.out.println("Rooms available :"+roomdata.roomAvailability.get("Standard Room"));
	}
	public void book() throws NumberFormatException, IOException {
		
		System.out.println("Enter number of people");
		 pax = Integer.parseInt(br.readLine());
		System.out.println("Enter number of Days");
		 days = Integer.parseInt(br.readLine());
		 
		 checkout(pax,days);
	}
	public void checkout(int pax, int days) throws IOException {
		System.out.println("Do you wish to confirm Y/N");
		String confirm = br.readLine();
		if(confirm.equals("Y")) {
			System.out.println("\nYour Booking details are :\n"+"Room Type: Standard Room"+"\nPrice: "+getroomPrice()+"\nNo of people: "+pax+"\nTotal Days: "+days );
		}
		else
			confirmBooking.book();
	}
}
