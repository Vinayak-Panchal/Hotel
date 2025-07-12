
import java.io.IOException;

import Booking.ConfirmBooking;

public class HotelMain {

	public static void main(String[] args) throws IOException { 
		
		ConfirmBooking confirmBooking = new ConfirmBooking();
		
		System.out.println("*********WELCOME TO GALAXY HOTEL*********");
		confirmBooking.book();
		
	}
}
