package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Returns a Sorted Map giving for each symptom met in a list, its number of occurrences.
 *
 */
public class SymptomCounter {

    /**
     *
     * @param symptomList list of symptom that may contain many duplications.
     * @return a TreeMap (sorted map) giving for all symptom its number of occurrences in the list
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
