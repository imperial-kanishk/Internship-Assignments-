public class FileProcessor {

    private int lineCount;
    private int wordCount;
    private int characterCount;

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public void processLine(String line) {

        lineCount++;

        characterCount += line.length();

        String[] words = line.trim().split("\\s+");

        if (!line.trim().isEmpty()) {
            wordCount += words.length;
        }
    }
}