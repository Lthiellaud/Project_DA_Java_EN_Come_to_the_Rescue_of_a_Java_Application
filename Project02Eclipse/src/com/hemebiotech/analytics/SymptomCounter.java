package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Sorted HashMap giving for each symptom, the number of occurrences met in a list.
 */
public class SymptomCounter {
    //private TreeMap<String, Integer> symptomCounter = new TreeMap<>();

    /**
     * @param symptomList list of strings that may contain many duplications.
     *
     */
    public TreeMap<String, Integer> countSymptom (ArrayList<String> symptomList) {
        TreeMap<String, Integer> symptomCounter = new TreeMap<>();
        if ( !symptomList.isEmpty()) {
            for (String symptom : symptomList) {
                // If symptom exists add 1 tu the current value, else add an entry with the value 1
                symptomCounter.merge(symptom, 1, Integer::sum);
            }
        }
        return symptomCounter;
    }

}
