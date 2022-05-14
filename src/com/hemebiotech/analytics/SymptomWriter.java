package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class SymptomWriter implements ISymptomWriter {

	/** This class calls the HashMap containing symptoms and their number of
	* occurrences to print them on a file result.out
	* @param symptomList a HashMap of all symptoms and their occurrences
	* @throws IOException
	*/
	
	public static final String OUTPUT = "result.out";
	
	@Override
	public void writeToFile(TreeMap<String, Integer> symptomList) throws IOException {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(OUTPUT));

			// This writer will print the results as follow : the symptom (the map key) and
			// its number of occurrences (the value attached to that key)
			for (String symptom : symptomList.keySet()) {
				writer.write(symptom + " : " + symptomList.get(symptom) + "\n");
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if (writer != null) {
				writer.close();
			}
		}


	}

}
