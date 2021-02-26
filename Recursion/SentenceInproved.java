package Recursion;

// Bogdan Pasterak L00157106
// 26/02/2021
// Tests whether this sentence is a palindrome. 
public class SentenceInproved {
    private String text;

    // Constructor
    public SentenceInproved(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }

    // Test palindrome
    // @return true if this sentence is a palindrome, false otherwise
    public boolean isPalindrome(int start, int end) {
        // if length is 0 or 1 exit (is palindrome)
        if (start >= end) {
            return true;
        }

        // First and last character to lovercase
        char first = Character.toLowerCase(text.charAt(start));
        char last = Character.toLowerCase(text.charAt(end));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                // check rest of sentence without this characters
                return isPalindrome(start + 1, end -1);
            } else {
                return false;
            }
        } else if (! Character.isLetter(last)) {
            // Remove last character
            return isPalindrome(start, end -1);
        } else {
            return isPalindrome(start + 1, end);
        }
    }
}
