package com.school;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageService {
    public static void saveToFile(List<? extends Storable> objects, String filename) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            for (Storable obj : objects) {
                writer.write(obj.toStorageString() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename);
            e.printStackTrace();
        }
    }
}
