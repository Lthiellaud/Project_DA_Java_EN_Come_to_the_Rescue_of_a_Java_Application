package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will write symptom to an output file.
 * The implementation need the input parameter to be a treemap (map is sorted according to the natural ordering of its keys)
 *
 */
public interface ISymptomWriter {
    /**
     *
     * @param countedAndSortedSymptom The TreeMap to be written in the output file
     */
    void outSymptom(TreeMap<String, Integer> countedAndSortedSymptom);
}
