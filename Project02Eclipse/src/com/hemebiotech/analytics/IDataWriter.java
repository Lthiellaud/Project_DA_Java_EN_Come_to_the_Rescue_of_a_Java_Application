package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write data from a map to an output.
 * The implementation need the input parameter to be a map
 *
 */
public interface IDataWriter {
    /**
     *
     * @param countedData The Map to be written in the output
     */
    void outData(Map<String, Integer> countedData);
}
