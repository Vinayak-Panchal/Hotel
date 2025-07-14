package RoomDetails;

import java.util.Map;

public class RoomData {
	static Map<RoomType, Room> roomData = Map.of(RoomType.STANDARDROOM,new Room(RoomType.STANDARDROOM,1500,5),
												RoomType.CLASSICROOM, new Room(RoomType.CLASSICROOM,2000,5),
												RoomType.DOUBLEBEDROOM, new Room(RoomType.DOUBLEBEDROOM,2500,5),
												RoomType.NONACROOM, new Room(RoomType.NONACROOM,1000,5),
												RoomType.ACROOM, new Room(RoomType.ACROOM,1200,5));
	
	public Room getRoom(RoomType roomType) {
		return roomData.get(roomType);
	}
}
