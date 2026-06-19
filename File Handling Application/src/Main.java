import java.io.*;

public class Main {

    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();

        try (
                FileReader fr = new FileReader("input.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                processor.processLine(line);
            }

            writeReport(processor);

            System.out.println("Analysis completed!");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    private static void writeReport(FileProcessor processor) {

        try (
                FileWriter fw = new FileWriter("output.txt");
                BufferedWriter bw = new BufferedWriter(fw)
        ) {

            bw.write("FILE ANALYSIS REPORT\n");
            bw.write("--------------------\n");

            bw.write("Lines: " + processor.getLineCount() + "\n");
            bw.write("Words: " + processor.getWordCount() + "\n");
            bw.write("Characters: " + processor.getCharacterCount());

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}