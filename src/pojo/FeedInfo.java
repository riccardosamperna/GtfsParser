package pojo;

import com.googlecode.jcsv.annotations.MapToColumn;

public class FeedInfo {
	@MapToColumn(column=0)
	private String publisher_name;
	@MapToColumn(column=1)
	private String publisher_url;
	@MapToColumn(column=2)
	private String lang;
	@MapToColumn(column=3)
	private String start_date;
	@MapToColumn(column=4)
	private String end_date;
	@MapToColumn(column=5)
	private String version;
	
	public FeedInfo() {
	}

	public FeedInfo(String publisher_name, String publisher_url, String lang,
			String start_date, String end_date, String version) {
		this.publisher_name = publisher_name;
		this.publisher_url = publisher_url;
		this.lang = lang;
		this.start_date = start_date;
		this.end_date = end_date;
		this.version = version;
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public String getPublisher_url() {
		return publisher_url;
	}

	public String getLang() {
		return lang;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public String getVersion() {
		return version;
	}
	
	@Override
	public String toString() {
		return "FeedInfo [publisher_name=" + publisher_name + ", publisher_url=" + publisher_url + ", lang="
				+ lang + ", start_date=" + start_date + ", end_date="
				+ end_date + ", version=" + version + "]";
	}	
	 
}
