package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class StopTime {
	@MapToColumn(column=0)
	private String trip_id;
	@MapToColumn(column=1)
	private String arrival_time;
	@MapToColumn(column=2)
	private String departure_time;
	@MapToColumn(column=3)
	private String stop_id;
	@MapToColumn(column=4)
	private String stop_sequence;
	@MapToColumn(column=5)
	private String stop_headsign;
	@MapToColumn(column=6)
	private String pickup_type;
	@MapToColumn(column=7)
	private String drop_off_type;
	@MapToColumn(column=8)
	private String shape_dist_traveled;
	@MapToColumn(column=9)
	private String attributes_ch;
	
	
	public StopTime() {
		super();
	}

	public StopTime(String trip_id, String arrival_time, String departure_time,
			String stop_id, String stop_sequence, String stop_headsign,
			String pickup_type, String drop_off_type,
			String shape_dist_traveled, String attributes_ch) {
		this.trip_id = trip_id;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.stop_id = stop_id;
		this.stop_sequence = stop_sequence;
		this.stop_headsign = stop_headsign;
		this.pickup_type = pickup_type;
		this.drop_off_type = drop_off_type;
		this.shape_dist_traveled = shape_dist_traveled;
		this.attributes_ch = attributes_ch;
	}

	public String getTrip_id() {
		return trip_id;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public String getStop_id() {
		return stop_id;
	}

	public String getStop_sequence() {
		return stop_sequence;
	}

	public String getStop_headsign() {
		return stop_headsign;
	}

	public String getPickup_type() {
		return pickup_type;
	}

	public String getDrop_off_type() {
		return drop_off_type;
	}

	public String getShape_dist_traveled() {
		return shape_dist_traveled;
	}

	public String getAttributes_ch() {
		return attributes_ch;
	}
	
	@Override
	public String toString() {
		return "StopTime [trip_id=" + trip_id + ", arrival_time=" + arrival_time + ", departure_time="
				+ departure_time + ", stop_id=" + stop_id + ", stop_sequence="
				+ stop_sequence + ", stop_headsign=" + stop_headsign + ", pickup_type=" 
				+ pickup_type + ", drop_off_type=" + drop_off_type + ", shape_dist_traveled="
				+ shape_dist_traveled + ", attributes_ch=" + attributes_ch + "]";
	}

}
