package RoomDetails;

import java.util.Map;

public class RoomData {
	Map<String, Integer> roomPriceData = Map.of("Standard Room",1500,
												"Classic Room", 1200,
												"DoubleBed Room", 2000,
												"Non AC Room", 1000,
												"AC Room", 1200);
	Map<String, Integer> roomAvailability = Map.of("Standard Room",5,
													"Classic Room", 5,
													"DoubleBed Room", 5,
													"Non AC Room", 5,
													"AC Room", 5);
}
