package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

	/**
	 * Anything that will sort symptoms and their occurrences into a map
	 * 
	 */
	
	
public interface ISymptomWriter {
	
	/** 
	 *
	 * @param symptomList
	 * @throws IOException
	 */
	public void writeToFile(TreeMap<String, Integer> symptomList) throws IOException;
	

}
