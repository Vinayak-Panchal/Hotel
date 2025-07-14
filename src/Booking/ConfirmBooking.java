package Booking;

import java.io.IOException;
import Customer_Dto.Customer;
import RoomDetails.Room;
import RoomDetails.RoomData;
import RoomDetails.RoomType;

public class ConfirmBooking {
	
	private final RoomData roomData;
	

	public ConfirmBooking(RoomData roomData) {
		 this.roomData = roomData;
	}

	public void displayRoomDetails(RoomType roomtype) {
		Room room = roomData.getRoom(roomtype);
		System.out.println("Room Type : "+roomtype);
		System.out.println("Room Price : "+room.getPrice());
		System.out.println("Room Availabilty : "+room.getVacancy());
	}
	
	public void book(RoomType roomType, int pax, int days, Customer customer) throws NumberFormatException, IOException {
		
		Room room = roomData.getRoom(roomType);
		if(room.getVacancy()>0)
		{
			long totalPrice = room.getPrice()*days;
			System.out.println("Booking Confirmed \n");
			System.out.println("Room Type :"+ roomType+"\n"+
								"Room price per day :"+room.getPrice()+"\n"+
								"Customer Id : "+customer.getId()+"\n"+
								"Cutomer Name : "+customer.getcustomerName()+"\n"+
								"Customer Address : "+customer.getAddress()+"\n"+
								"Total Booking Amount : "+totalPrice);
		}
		
	}
	
}
