package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static final String INPUT = "symptoms.txt";

	/**
	 * Main method that counts and prints every symptom and their occurrences
	 * @param args
	 * @throws Exception, IOException
	 */
	public static void main(String args[]) throws Exception, IOException {
		
		/**
		 * Reads symptoms from a file, one per line
		 * @return ArrayList<String>
		 */
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(INPUT);
		List<String> result = readSymptomDataFromFile.getSymptoms();
		/**
		 * Sorts symptom in a TreeMap, with the symptom as the key and the number
		 * of occurrences as the value
		 */
		
		SymptomSorter symptomSorter = new SymptomSorter();
		TreeMap<String,Integer> symptomList = symptomSorter.sortSymptom(result);
		
		/**
		 * Prints the TreeMap into a text file
		 */
		
		SymptomWriter writer = new SymptomWriter();
		writer.writeToFile(symptomList);
		
		
		
		
		
		
}}
