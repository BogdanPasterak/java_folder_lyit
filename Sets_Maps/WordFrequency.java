package Sets_Maps;

import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> documentWords = readWords("Sets_Maps/alice30.txt");

        int i = 0;
        for (String key : documentWords.keySet()) {
            System.out.println(key + "\t\t" + documentWords.get(key));
            if (++i > 70)
                break;
        }

    }

    /**
     * Reads all words from a file.
     * 
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a word is a
     *         sequence of upper- and lowercase letters.
     */
    public static Map<String, Integer> readWords(String filename) throws FileNotFoundException {
        Map<String, Integer> words = new TreeMap<String, Integer>();
        Scanner in = new Scanner(new File(filename));
        // Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[\\s,.?!\\(\\)]+");

        String word;

        while (in.hasNext()) {
            word = in.next().toLowerCase().replaceAll("[^a-z]", "");
            if (word.length() > 0) {
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }
        }
        return words;
    }

}
