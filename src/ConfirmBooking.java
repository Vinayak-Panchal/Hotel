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
				System.out.println("Do you wish to book (Y/N)");
				confirm = br.readLine();
				if(confirm.equals("Y"))
				{
					System.out.println("Enter number of people");
					int pax = Integer.parseInt(br.readLine());
					System.out.println("Enter number of Days");
					int days = Integer.parseInt(br.readLine());
					checkout("Standard Room", 1500, pax, days);
					return;
				}
				
				else
					break;
			}
		}while(confirm!="N");
	}
	public void checkout(String roomType, long price, int noOfPax, int noOfDays) throws NumberFormatException, IOException {
		System.out.println("Do you wish to confirm Y/N");
		Scanner scan = new Scanner(System.in);
		String confirm = scan.next();
		if(confirm.equals("Y")) {
			System.out.println("Your Booking details are :\n"+"Room Type: "+roomType+"\nPrice: "+price+"\nNo of people: "+noOfPax+"\nTotal Days: "+noOfDays );
		}
		else
			book();
		
	}
}
