package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Returns a Sorted Map giving for each data met in a list, its number of occurrences.
 *
 */
public class CounterAndSorter implements ICounterAndSorter {

    /**
     *
     * @param dataList list of data that may contain many duplications.
     * @return a TreeMap (sorted map) giving for each data, its number of occurrences in the list
     */
    @Override
    public TreeMap<String, Integer> countAndSort (List<String> dataList) {
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
