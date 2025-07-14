
import java.io.IOException;

import Booking.ConfirmBooking;
import RoomDetails.RoomData;
import controller.ConsoleController;

public class HotelMain {

	public static void main(String[] args) throws IOException { 
		
		System.out.println("*********WELCOME TO GALAXY HOTEL*********");
		RoomData roomData = new RoomData();
		ConfirmBooking confirmBooking = new ConfirmBooking(roomData);
		ConsoleController console = new ConsoleController(confirmBooking);
		console.menu();
	}
}
