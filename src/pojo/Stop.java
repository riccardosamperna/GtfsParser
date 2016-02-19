package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class Stop {
	@MapToColumn(column=0)
	private String id;
	@MapToColumn(column=1)
	private String code;
	@MapToColumn(column=2)
	private String name;
	@MapToColumn(column=3)
	private String description;
	@MapToColumn(column=4)
	private String latitude;
	@MapToColumn(column=5)
	private String longitude;
	@MapToColumn(column=6)
	private String zone_id;
	@MapToColumn(column=7)
	private String url;
	@MapToColumn(column=8)
	private String location_type;
	@MapToColumn(column=9)
	private String parent_station;
	@MapToColumn(column=10)
	private String platform_code;
	@MapToColumn(column=11)
	private String ch_station_long_name;
	@MapToColumn(column=12)
	private String ch_station_synonym1;
	@MapToColumn(column=13)
	private String ch_station_synonym2;
	@MapToColumn(column=14)
	private String ch_station_synonym3;
	@MapToColumn(column=15)
	private String ch_station_synonym4;	
	
	
	
	public Stop() {
	}

	public Stop(String id, String code, String name, String description,
			String latitude, String longitude, String zone_id, String url,
			String location_type, String parent_station, String platform_code,
			String ch_station_long_name, String ch_station_synonym1,
			String ch_station_synonym2, String ch_station_synonym3,
			String ch_station_synonym4) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.zone_id = zone_id;
		this.url = url;
		this.location_type = location_type;
		this.parent_station = parent_station;
		this.platform_code = platform_code;
		this.ch_station_long_name = ch_station_long_name;
		this.ch_station_synonym1 = ch_station_synonym1;
		this.ch_station_synonym2 = ch_station_synonym2;
		this.ch_station_synonym3 = ch_station_synonym3;
		this.ch_station_synonym4 = ch_station_synonym4;
	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getZone_id() {
		return zone_id;
	}

	public String getUrl() {
		return url;
	}

	public String getLocation_type() {
		return location_type;
	}

	public String getParent_station() {
		return parent_station;
	}

	public String getPlatform_code() {
		return platform_code;
	}

	public String getCh_station_long_name() {
		return ch_station_long_name;
	}

	public String getCh_station_synonym1() {
		return ch_station_synonym1;
	}

	public String getCh_station_synonym2() {
		return ch_station_synonym2;
	}

	public String getCh_station_synonym3() {
		return ch_station_synonym3;
	}

	public String getCh_station_synonym4() {
		return ch_station_synonym4;
	}

	@Override
	public String toString() {
		return "Stop [id=" + id + ", code=" + code + ", name="
				+ name + ", description=" + description + ", latitude="
				+ latitude + ", longitude=" + longitude + ", location_type="
				+ location_type + ", parent_station=" + parent_station +", platform_code="
				+ platform_code +", ch_station_long_name="
				+ ch_station_long_name + ", ch_station_synonym1=" 
				+ ch_station_synonym1 +", ch_station_synonym2=" 
				+ ch_station_synonym2 +", ch_station_synonym3=" 
				+ ch_station_synonym3 + ", ch_station_synonym4=" 
				+ ch_station_synonym4 + "]";
	}
}
