package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

import static com.hemebiotech.analytics.FileConstant.IN_FILE;
import static com.hemebiotech.analytics.FileConstant.OUT_FILE;

/**
 * Reads a file containing a symptom by line (with duplication) and
 * writes a sorted file containing the number of occurrence for each symptom read.
 * <p> *
 * One line in the output file looks like : SymptomName=SymptomCounter
 * </p>
 *
 * @see ReadSymptomDataFromFile
 * @see CounterAndSorter
 * @see WriteDataCountToFile
 */
public class AnalyticsCounter {

	public static void main(String[] args) {

		// Create a ArrayList containing all the lines of the input file
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(IN_FILE);
		ArrayList<String> symptomList = (ArrayList<String>) readSymptom.getSymptoms();

		// Count and Sort the symptoms
		CounterAndSorter symptomCounter = new CounterAndSorter();
		TreeMap<String, Integer> countedAndSortedSymptom = symptomCounter.countAndSort(symptomList);

		// Generate the output file
		WriteDataCountToFile writeSymptom = new WriteDataCountToFile(OUT_FILE);
		writeSymptom.outData(countedAndSortedSymptom);

	}
}
