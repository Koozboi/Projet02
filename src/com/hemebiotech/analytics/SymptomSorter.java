package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
	/**
	 *@param result which is a list of strings
	 *@return symptomList a map of all symptoms and their occurrences
	 */

public class SymptomSorter implements ISymptomSorter {
	
	/**
	 * 
	 * @param BufferedReader fileReader
	 * @return TreeMap
	 */
	
	@Override
	public TreeMap<String, Integer> sortSymptom(List<String> result) {
	
		// A map that stores symptoms (keys) and their number of occurrences (values)
		TreeMap<String, Integer> symptomList = new TreeMap<>();


			// Reads a new line as long as there is a line to read
			for (String symptom : result) {

				// Adds a symptom if new, increments value by 1 if the symptom already exists
				Integer count = symptomList.get(symptom);
				if (count == null) {
					symptomList.put(symptom, 1);
				}

				else {
					symptomList.put(symptom, count + 1);
				}
			}
			
	

		return symptomList;

		}

}