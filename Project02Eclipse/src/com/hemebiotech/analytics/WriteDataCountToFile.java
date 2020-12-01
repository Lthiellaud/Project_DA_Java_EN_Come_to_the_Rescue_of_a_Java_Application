package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * implementation of IDataWriter to write in a file defined by filepath (attribute of the class).
 *
 */
public class WriteDataCountToFile implements IDataWriter {
    private String filepath;
    /**
     *
     * @param filepath a full or partial path to the result file
     */
    WriteDataCountToFile(String filepath) {
        this.filepath=filepath;
    }
    /**
     * Write in the result file, the content of a Map in the format "key=value" - one key per line.
     * @param countedData The Map to be written in the output file defined by filepath
     */
    @Override
    public void outData(Map<String, Integer> countedData) {
        if (this.filepath != null) {
            try {
                FileWriter writer = new FileWriter(this.filepath);
                for (String symptom : countedData.keySet()) {
                    writer.write(symptom + "=" + countedData.get(symptom) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Please check the filepath OUT_FILE in FileConstant.java");
                System.exit(-1);
            }
        }
    }
}
