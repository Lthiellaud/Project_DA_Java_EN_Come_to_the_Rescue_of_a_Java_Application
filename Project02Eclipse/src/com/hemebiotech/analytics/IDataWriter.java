package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom to an output file.
 * The implementation need the input parameter to be a map
 *
 */
public interface IDataWriter {
    /**
     *
     * @param countedData The Map to be written in the output file
     */
    void outSymptom(Map<String, Integer> countedData);
}
