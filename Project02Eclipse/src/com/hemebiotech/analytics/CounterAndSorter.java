package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Returns a Sorted Map giving for each symptom met in a list, its number of occurrences.
 *
 */
public class CounterAndSorter {

    /**
     *
     * @param dataList list of symptom that may contain many duplications.
     * @return a TreeMap (sorted map) giving for all symptom its number of occurrences in the list
     */
    public TreeMap<String, Integer> countAndSort(ArrayList<String> dataList) {
        TreeMap<String, Integer> dataCounter = new TreeMap<>();
        if ( !dataList.isEmpty()) {
            for (String symptom : dataList) {
                // If data exists, add 1 to the current value, else add an entry with the value 1
                dataCounter.merge(symptom, 1, Integer::sum);
            }
        }
        return dataCounter;
    }

}
