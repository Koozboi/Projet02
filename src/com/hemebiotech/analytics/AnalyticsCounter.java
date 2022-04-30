package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {

	/**
	 * Méthode principale qui compte l'occurence de chaque symptome
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		// first get input
		
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();

		int headCount = 0;	// counts headaches
		int rashCount = 0;
		int pupilCount = 0;
		
		while (line != null) {
			
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.equals("dialated pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
			
			
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
