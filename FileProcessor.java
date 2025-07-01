import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileNotFoundException;

import java.io.IOException;



public class FileProcessor {

    public void processFile(String filePath) {

        FileReader reader = null;

        try {

            reader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // process the line

            }

        } catch (FileNotFoundException e) {

            System.err.println("File not found: " + e.getMessage());

        } catch (IOException e) {

            System.err.println("Error reading file: " + e.getMessage());

        } finally {

            if (reader != null) {

                try {

                    reader.close();

                } catch (IOException e) {

                    System.err.println("Error closing reader: " + e.getMessage());

                }

            }

        }

    }

}




