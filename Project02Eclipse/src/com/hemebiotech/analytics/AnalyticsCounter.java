package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// Definition of the input and output files
		String symptomReadFile = ".\\Project02Eclipse\\symptoms0.txt";
		String symptomCounterFile = ".\\Project02Eclipse\\result.out";

		// CreatE a ArrayList containing all the lines of th input file
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(symptomReadFile);
		ArrayList<String> symptomList = (ArrayList<String>) readSymptom.getSymptoms();

		// Sort and count the symptom
		SymptomCounter symptomCounter = new SymptomCounter();
		TreeMap<String, Integer> countedSymptom = symptomCounter.countSymptom(symptomList);

		// next generate output
		FileWriter writer = new FileWriter (symptomCounterFile);
		for (String symptom : countedSymptom.keySet()) {
			writer.write(symptom+"="+countedSymptom.get(symptom)+"\n");
		}

		writer.close();
	}
}
