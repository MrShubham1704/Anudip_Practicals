package Lab_8;

import java.io.*; // Importing necessary classes for file handling

public class FileCopy {
    public static void main(String[] args) {
        // Create File objects for input and output files
        File inputFile = new File("D:\\input2.txt");   
        File outputFile = new File("D:\\output2.txt");

        // Use try-with-resources to ensure the resources are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after writing each line
            }
            System.out.println("File copied successfully."); // Confirmation message
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace if an error occurs during file operations
        }
    }
}
