package parser;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import pojo.Agency;
import pojo.Calendar;
import pojo.CalendarVariation;
import pojo.FeedInfo;
import pojo.Frequency;
import pojo.Route;
import pojo.Stop;
import pojo.StopTime;
import pojo.Transfer;
import pojo.Trip;

import com.googlecode.jcsv.CSVStrategy;
import com.googlecode.jcsv.annotations.internal.ValueProcessorProvider;
import com.googlecode.jcsv.reader.CSVEntryParser;
import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.AnnotationEntryParser;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;

public class GtfsParser<E> {
	
	private static final List<Class<?>> ITEMS = Arrays.asList(Agency.class, CalendarVariation.class, Calendar.class,
            Route.class, Trip.class, Stop.class, StopTime.class, Transfer.class,
            Frequency.class, FeedInfo.class);
	
	private static final List<String> FILENAMES = Arrays.asList("resources/agency.txt", "resources/calendar_dates.txt", "resources/calendar.txt",
			"resources/routes.txt", "resources/trips.txt", "resources/stops.txt",
			"resources/stop_times.txt", "resources/transfers.txt", "resources/frequencies.txt", "resources/feed_info.txt");
	
	List<List<E>> parsedItems = new ArrayList<List<E>>();
	
	public GtfsParser(){
		
	}	
	
	public List<List<E>> getParsedItems() {
		return parsedItems;
	}

	public void setParsedItems(List<List<E>> parsedItems) {
		this.parsedItems = parsedItems;
	}



	public void parsedGtfs() throws IOException{
		Iterator<Class<?>> itemsIterator = ITEMS.iterator();
		Iterator<String> fileNamesIterator = FILENAMES.iterator();
		
		while (itemsIterator.hasNext() && fileNamesIterator.hasNext()){
			parse(itemsIterator.next(), fileNamesIterator.next());
		}
	}
	
	public void parse(Class<?> class1, String filename ) throws IOException{
		
		Reader reader = new FileReader(filename);

		ValueProcessorProvider provider = new ValueProcessorProvider();
		
		CSVEntryParser<E> entryParser = new AnnotationEntryParser<E>((Class<E>) class1, provider);
		CSVReader<E> csvReader = new CSVReaderBuilder<E>(reader)
																				.entryParser(entryParser)
																				.strategy(CSVStrategy.UK_DEFAULT)
																				.build();
		
		csvReader.readHeader();
		
		parsedItems.add(csvReader.readAll());
		
	}

}
