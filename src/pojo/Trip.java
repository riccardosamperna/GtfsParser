package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class Trip {
	@MapToColumn(column=0)
	private String route_id;
	@MapToColumn(column=1)
	private String service_id;
	@MapToColumn(column=2)
	private String id;
	@MapToColumn(column=3)
	private String headsign;
	@MapToColumn(column=4)
	private String short_name;
	@MapToColumn(column=5)
	private String direction_id;
	@MapToColumn(column=6)
	private String block_id;
	@MapToColumn(column=7)
	private String shape_id;
	@MapToColumn(column=8)
	private String bikes_allowed;
	@MapToColumn(column=9)
	private String attributes_ch;
	
	

	public Trip() {
	}

	public Trip(String route_id, String service_id, String id, String headsign,
			String short_name, String direction_id, String block_id,
			String shape_id, String bikes_allowed, String attributes_ch) {
		this.route_id = route_id;
		this.service_id = service_id;
		this.id = id;
		this.headsign = headsign;
		this.short_name = short_name;
		this.direction_id = direction_id;
		this.block_id = block_id;
		this.shape_id = shape_id;
		this.bikes_allowed = bikes_allowed;
		this.attributes_ch = attributes_ch;
	}

	public String getRoute_id() {
		return route_id;
	}

	public String getService_id() {
		return service_id;
	}

	public String getId() {
		return id;
	}

	public String getHeadsign() {
		return headsign;
	}

	public String getShort_name() {
		return short_name;
	}

	public String getDirection_id() {
		return direction_id;
	}

	public String getBlock_id() {
		return block_id;
	}

	public String getShape_id() {
		return shape_id;
	}

	public String getBikes_allowed() {
		return bikes_allowed;
	}

	public String getAttributes_ch() {
		return attributes_ch;
	}
	
	@Override
	public String toString() {
		return "Trip [route_id=" + route_id + ", service_id=" + service_id + ", id="
				+ id + ", headsign=" + headsign + ", short_name="
				+ short_name + ", direction_id=" + direction_id + ", block_id=" 
				+ block_id + ", shape_id=" + shape_id + ", bikes_allowed="
				+ bikes_allowed + ", attributes_ch=" + attributes_ch + "]";
	}
	
}
