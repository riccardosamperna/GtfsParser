package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class Transfer {
	@MapToColumn(column=0)
	private String from_stop_id;
	@MapToColumn(column=1)
	private String to_stop_id;
	@MapToColumn(column=2)
	private String type;
	@MapToColumn(column=3)
	private String min_transfer_time;
	
	public Transfer() {
	}

	public Transfer(String from_stop_id, String to_stop_id, String type,
			String min_transfer_time) {
		this.from_stop_id = from_stop_id;
		this.to_stop_id = to_stop_id;
		this.type = type;
		this.min_transfer_time = min_transfer_time;
	}

	public String getFrom_stop_id() {
		return from_stop_id;
	}

	public String getTo_stop_id() {
		return to_stop_id;
	}

	public String getType() {
		return type;
	}

	public String getMin_transfer_time() {
		return min_transfer_time;
	}
	
	@Override
	public String toString() {
		return "Transfer [from_stop_id=" + from_stop_id + ", to_stop_id=" + to_stop_id + ", type="
				+ type + ", min_transfer_time=" + min_transfer_time + "]";
	}
	
}
