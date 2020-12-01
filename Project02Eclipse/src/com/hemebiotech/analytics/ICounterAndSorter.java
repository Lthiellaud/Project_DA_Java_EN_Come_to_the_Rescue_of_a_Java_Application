package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * Anything that will count and sort data from a list.
 * <p>
 * The important part is : the return value of the operation is a TreeMap that enables to sort the data following
 * its natural sort order by construction
 * </p>
 */
public interface ICounterAndSorter {
    /**
     *
     * @param data a list of data (String) that needs to be counted and sorted
     * @return a TreeMap containing as keys, all distinct data of the data list, and as value, the number of
     * occurrences of each data in the input list
     */
    TreeMap<String,Integer> countAndSort (List<String> data);

}
