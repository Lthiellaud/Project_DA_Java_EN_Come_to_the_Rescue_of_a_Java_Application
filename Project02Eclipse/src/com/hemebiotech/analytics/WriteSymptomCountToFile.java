package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomCountToFile implements ISymptomWriter {
    private String filepath;
    /**
     *
     * @param filepath a full or partial path to the result file
     */
    WriteSymptomCountToFile(String filepath) {
        this.filepath=filepath;
    }
    /**
     * Write in the result file the content of a TreeMap in the format "key=value" - one key per line.
     * @param countedAndSortedSymptom The TreeMap to be written in the output file
     */
    public void outSymptom(TreeMap<String, Integer> countedAndSortedSymptom) {
        if (this.filepath != null) {
            try {
                FileWriter writer = new FileWriter(this.filepath);
                for (String symptom : countedAndSortedSymptom.keySet()) {
                    writer.write(symptom + "=" + countedAndSortedSymptom.get(symptom) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }
}
