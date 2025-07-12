package Booking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import RoomDetails.StandardRoom;

public class ConfirmBooking {
	
	public void book() throws NumberFormatException, IOException {
		StandardRoom standardRoom = new StandardRoom();
		String confirm ="";
		do
		{
			System.out.println("\nSelect your Room \n");
			System.out.println("1: Standard Room");
			System.out.println("2: Classic Room");
			System.out.println("3: DoubleBed Room");
			System.out.println("4: Non AC Room");
			System.out.println("5: AC Room");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch = Integer.parseInt(br.readLine());
			
		
			switch(ch) {
			case 1: 
				standardRoom.roomPrice();
				standardRoom.roomAvailability();
				standardRoom.book();
				System.out.println("Do you wish to book (Y/N)");
				String bookConfirm = br.readLine();
				if(bookConfirm.equals("Y"))
				{
					standardRoom.checkout(ch, ch);
					return;
				}
				else
					book();
			case 2:
				
			}
		}while(confirm!="N");
	}
	
}
