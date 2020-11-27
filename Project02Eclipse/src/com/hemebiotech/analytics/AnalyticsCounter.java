package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// Definition of the input and output files
		String symptomReadFile = ".\\Project02Eclipse\\symptoms.txt";
		String symptomCounterFile = ".\\Project02Eclipse\\result.out";

		// CreatE a ArrayList containing all the lines of th input file
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
