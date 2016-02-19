package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class CalendarVariation {
	@MapToColumn(column=0)
	private String service_id;
	@MapToColumn(column=1)
	private String date;
	@MapToColumn(column=2)
	private String exception_type;
		
	public CalendarVariation() {
	}

	public CalendarVariation(String service_id, String date,
			String exception_type) {
		this.service_id = service_id;
		this.date = date;
		this.exception_type = exception_type;
	}

	public String getService_id() {
		return service_id;
	}

	public String getDate() {
		return date;
	}

	public String getException_type() {
		return exception_type;
	}
	
	@Override
	public String toString() {
		return "CalendarVariation [service_id=" + service_id + ", date=" + date + ", exception_type="
				+ exception_type + "]";
	}

}
