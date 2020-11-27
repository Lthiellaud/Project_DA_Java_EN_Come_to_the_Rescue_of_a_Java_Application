package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Reads a file containing a symptom by line (with duplication) and Write a sorted file containing the number of occurrence for each symptom read.
 * <p> *
 * One line in the output file looks like : SymptomName=SymptomCounter
 * </p>
 *
 * @see ReadSymptomDataFromFile
 * @see SymptomCounter
 * @see WriteSymptomCountToFile
 */
public class AnalyticsCounter {

	public static void main(String[] args) {
		// Definition of the input and output files
		String symptomReadFile = ".\\Project02Eclipse\\symptoms.txt";
		String symptomCounterFile = ".\\Project02Eclipse\\results.out";

		// Create a ArrayList containing all the lines of the input file
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(symptomReadFile);
		ArrayList<String> symptomList = (ArrayList<String>) readSymptom.getSymptoms();

		// Sort and count the symptom
		SymptomCounter symptomCounter = new SymptomCounter();
		TreeMap<String, Integer> countedAndSortedSymptom = symptomCounter.countSymptom(symptomList);

		// next generate output
		WriteSymptomCountToFile writeSymptom = new WriteSymptomCountToFile(symptomCounterFile);
		writeSymptom.outSymptom(countedAndSortedSymptom);

	}
}
