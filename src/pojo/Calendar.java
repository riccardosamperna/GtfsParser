package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;


public class Calendar {
	@MapToColumn(column=0)
	private String service_id;
	@MapToColumn(column=1)
	private boolean monday;
	@MapToColumn(column=2)
	private boolean tuesday;
	@MapToColumn(column=3)
	private boolean wednesday;
	@MapToColumn(column=4)
	private boolean thursday;
	@MapToColumn(column=5)
	private boolean friday;
	@MapToColumn(column=6)
	private boolean saturday;
	@MapToColumn(column=7)
	private boolean sunday;
	@MapToColumn(column=8)
	private String start_date;
	@MapToColumn(column=9)
	private String end_date;
	
	public Calendar() {
	}

	public Calendar(String service_id, boolean monday, boolean tuesday,
			boolean wednesday, boolean thursday, boolean friday,
			boolean saturday, boolean sunday, String start_date, String end_date) {
		this.service_id = service_id;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public String getService_id() {
		return service_id;
	}

	public boolean isMonday() {
		return monday;
	}

	public boolean isTuesday() {
		return tuesday;
	}

	public boolean isWednesday() {
		return wednesday;
	}

	public boolean isThursday() {
		return thursday;
	}

	public boolean isFriday() {
		return friday;
	}

	public boolean isSaturday() {
		return saturday;
	}

	public boolean isSunday() {
		return sunday;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getEnd_date() {
		return end_date;
	}
	
	@Override
	public String toString() {
		return "Calendar [service_id=" + service_id + ", monday=" + monday + ", tuesday="
				+ tuesday + ", wednesday=" + wednesday + ", thursday="
				+ thursday + ", friday=" + friday + ", saturday=" + saturday + ", sunday="
				+ sunday + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}

}
