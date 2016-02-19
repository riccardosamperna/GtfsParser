package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class Frequency {
	@MapToColumn(column=0)
	private String trip_id;
	@MapToColumn(column=1)
	private String start_time;
	@MapToColumn(column=2)
	private String end_time;
	@MapToColumn(column=3)
	private String headway_secs;
	
	public Frequency() {
	}

	public Frequency(String trip_id, String start_time, String end_time,
			String headway_secs) {
		this.trip_id = trip_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.headway_secs = headway_secs;
	}

	public String getTrip_id() {
		return trip_id;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getHeadway_secs() {
		return headway_secs;
	}
	
	@Override
	public String toString() {
		return "Frequency [trip_id=" + trip_id + ", start_time=" + start_time + ", end_time="
				+ end_time + ", headway_secs=" + headway_secs + "]";
	}	

}
