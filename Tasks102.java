import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCount {

    public static void main(String[] args) {
        // Text file
        String QtechFilename = "word.txt";

        // Hashmap
        Map<String, Integer> QtechWordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(QtechFilename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // StringTokenizer
                StringTokenizer QtechTokenizer = new StringTokenizer(line, " \t\n\r\f,;:.\"?![]");

                while (QtechTokenizer.hasMoreTokens()) {
                    String QtechWord = QtechTokenizer.nextToken().toLowerCase();
                    // Update HashMap
                    QtechWordCounts.put(QtechWord, QtechWordCounts.getOrDefault(QtechWord, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  TreeMap order
        TreeMap<String, Integer> QtechSortedWordCounts = new TreeMap<>(QtechWordCounts);

        // Word counts 
        for (Map.Entry<String, Integer> QtechEntry : QtechSortedWordCounts.entrySet()) {
            System.out.println(Qtechentry.getKey() + ": " + Qtechentry.getValue());
        }
    }
}
