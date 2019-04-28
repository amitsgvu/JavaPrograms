import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import au.com.bytecode.opencsv.CSVWriter;

public class OpenCSVWriter {

public static void main(String[] args) {
		
	final String STRING_ARRAY_SAMPLE = "./string-array-sample.csv";
		
		try {
			 Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));

	            CSVWriter csvWriter = new CSVWriter(writer,
	                    CSVWriter.DEFAULT_SEPARATOR,
	                    CSVWriter.NO_QUOTE_CHARACTER,
	                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                    CSVWriter.DEFAULT_LINE_END);
				ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
				HashMap<String, String> map;
				
				
				/*** Rows 1 ***/
				map = new HashMap<String, String>();
				map.put("CustomerID","C001");
				map.put("Name", "Win Weerachai");
				map.put("Email", "win.weerachai@thaicreate.com");
				map.put("CountryCode", "TH");
				map.put("Budget", "1000000");
				map.put("Used", "600000");
				myArrList.add(map);

				/*** Rows 2 ***/
				map = new HashMap<String, String>();
				map.put("CustomerID","C002");
				map.put("Name", "John  Smith");
				map.put("Email", "john.smith@thaicreate.com");
				map.put("CountryCode", "UK");
				map.put("Budget", "2000000");
				map.put("Used", "800000");
				myArrList.add(map);
				
				/*** Rows 3 ***/
				map = new HashMap<String, String>();
				map.put("CustomerID","C003");
				map.put("Name", "Jame Born");
				map.put("Email", "jame.born@thaicreate.com");
				map.put("CountryCode", "US");
				map.put("Budget", "3000000");
				map.put("Used", "600000");
				myArrList.add(map);
				
				/*** Rows 4 ***/
				map = new HashMap<String, String>();
				map.put("CustomerID","C004");
				map.put("Name", "Chalee Angel");
				map.put("Email", "chalee.angel@thaicreate.com");
				map.put("CountryCode", "US");
				map.put("Budget", "4000000");
				map.put("Used", "100000");
				myArrList.add(map);
				
				
			
				// Write CSV
				for (int i = 0; i < myArrList.size(); i++) {	 
				//	Writer.write(myArrList.get(i).get("name").toString());
				
					writer.write(",");
					
					writer.write(myArrList.get(i).get("Name").toString());
					writer.write("");
					writer.write(myArrList.get(i).get("Email").toString());
					writer.write(",");
					writer.write(myArrList.get(i).get("CountryCode").toString());
					writer.write(",");
					writer.write(myArrList.get(i).get("Budget").toString());
					writer.write(",");
					writer.write(myArrList.get(i).get("Used").toString());
					writer.write("\r\n");
				}
			
				System.out.println("Write success!");
				writer.close();
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
	

}
