package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class Route {
	@MapToColumn(column=0)
	String id;
	@MapToColumn(column=1)
	String agency_id;
	@MapToColumn(column=2)
	String short_name;
	@MapToColumn(column=3)
	String long_name;
	@MapToColumn(column=4)
	String description;
	@MapToColumn(column=5)
	String type;
	@MapToColumn(column=6)
	String url;
	@MapToColumn(column=7)
	String color;
	@MapToColumn(column=8)
	String text_color;

	
	public Route() {
	}

	public Route(String id, String agency_id, String short_name,
			String long_name, String description, String type, String url,
			String color, String text_color) {
		this.id = id;
		this.agency_id = agency_id;
		this.short_name = short_name;
		this.long_name = long_name;
		this.description = description;
		this.type = type;
		this.url = url;
		this.color = color;
		this.text_color = text_color;
	}

	public String getId() {
		return id;
	}

	public String getAgency_id() {
		return agency_id;
	}

	public String getShort_name() {
		return short_name;
	}

	public String getLong_name() {
		return long_name;
	}

	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}

	public String getUrl() {
		return url;
	}

	public String getColor() {
		return color;
	}

	public String getText_color() {
		return text_color;
	}
	
	@Override
	public String toString() {
		return "Route [id=" + id + ", agency_id=" + agency_id + ", short_name="
				+ short_name + ", long_name=" + long_name + ", description="
				+ description + ", type=" + type + ", url=" + url + ", color=" + color
				+ ", text_color=" + text_color +"]";
	}	

}
