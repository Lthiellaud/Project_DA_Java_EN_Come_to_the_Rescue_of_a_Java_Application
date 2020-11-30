package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

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
     * Write in the result file the content of a Map in the format "key=value" - one key per line.
     * @param countedSymptom The Map to be written in the output file
     */
    public void outSymptom(Map<String, Integer> countedSymptom) {
        if (this.filepath != null) {
            try {
                FileWriter writer = new FileWriter(this.filepath);
                for (String symptom : countedSymptom.keySet()) {
                    writer.write(symptom + "=" + countedSymptom.get(symptom) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }
}
