package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;


public class Agency {
	@MapToColumn(column=0)
	private String id;
	@MapToColumn(column=1)
	private String name;
	@MapToColumn(column=2)
	private String url;
	@MapToColumn(column=3)
	private String timezone;
	@MapToColumn(column=4)
	private String language;
	@MapToColumn(column=5)
	private String phone;
		
	public Agency() {
	}

	public Agency(String id, String name, String url, String timezone, String language, String phone) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.timezone = timezone;
		this.language = language;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getLanguage() {
		return language;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Agency [id=" + id + ", name=" + name + ", url="
				+ url + ", timezone=" + timezone + ", language="
				+ language + ", phone=" + phone + "]";
	}	
}
