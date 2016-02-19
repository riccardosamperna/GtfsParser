package main;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import parser.GtfsParser;
import pojo.Agency;

import com.googlecode.jcsv.CSVStrategy;
import com.googlecode.jcsv.annotations.internal.ValueProcessorProvider;
import com.googlecode.jcsv.reader.CSVEntryParser;
import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.AnnotationEntryParser;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;

public class Gtfs {

	public static void main(String[] args) throws IOException {
//		Reader reader = new FileReader("resources/agency.txt");
//
//		ValueProcessorProvider provider = new ValueProcessorProvider();
//		
//		CSVEntryParser<Agency> entryParser = new AnnotationEntryParser<Agency>(Agency.class, provider);
//		CSVReader<Agency> csvAgencyReader = new CSVReaderBuilder<Agency>(reader)
//																				.entryParser(entryParser)
//																				.strategy(CSVStrategy.UK_DEFAULT)
//																				.build();
//		
//		List<String> header = csvAgencyReader.readHeader();
//		
//		for (String s: header){
//			System.out.println(s);
//		}
//		
//		for(Agency a: csvAgencyReader){
//			System.out.println(a.toString());
//		}
		
		GtfsParser test = new GtfsParser();
		
		test.parsedGtfs();
		
		for(int i = 0; i < test.getParsedItems().size(); i++){
			for (int j = 0; j < ((List) test.getParsedItems().get(i)).size(); j++){
				System.out.println(((List) test.getParsedItems().get(i)).get(j).toString());
			}
		}

	}

}
