package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Booking.ConfirmBooking;
import Customer_Dto.Customer;
import RoomDetails.RoomType;

public class ConsoleController {
	
	private ConfirmBooking confirmBooking;
	
	public ConsoleController(ConfirmBooking confirmBooking) {
		 this.confirmBooking = confirmBooking;
	}

	
	public void menu() throws NumberFormatException, IOException {
		while(true)
		{
			System.out.println("\nSelect your Room \n");
			
			for(RoomType roomType:RoomType.values()) {
				System.out.println(roomType.ordinal()+1+": "+roomType);
			}
			
			System.out.println("\nEnter your Choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch = Integer.parseInt(br.readLine());
			
			RoomType roomType = RoomType.values()[ch-1];
			confirmBooking.displayRoomDetails(roomType);
			System.out.println("Do you wish to book (Y/N)");
			String bookConfirm = br.readLine();
			if(bookConfirm.equals("Y"))
			{
				System.out.println("Enter Customer Id ");
				int customerId = Integer.parseInt(br.readLine());
				System.out.println("Enter Customer Name ");
				String customerName = br.readLine();
				System.out.println("Enter Customer City ");
				String city = br.readLine();
				Customer customer = new Customer(customerId,customerName,city);
				
				System.out.println("Enter number of pax ");
				int pax  = Integer.parseInt(br.readLine());
				System.out.println("Enter number of days ");
				int days = Integer.parseInt(br.readLine());
				
				System.out.println("Do you wish to continue (Y/N)");
				String again = br.readLine();
				if(again.equals("Y")) {
					confirmBooking.book(roomType, pax, days, customer);
					break;
				}
				else
					continue;
			}
		
		}
	}
	
}
