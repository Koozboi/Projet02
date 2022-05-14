package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will sort symptoms and their occurrences into a map
 * 
 */

public interface ISymptomSorter {
	
	
/**
 * 
 * 
 * 
 * @return a map of all Symptoms and their occurrences
 * @throws IOException
 */
	
	




TreeMap<String, Integer> sortSymptom(List<String> result) throws IOException;
	
	
}
