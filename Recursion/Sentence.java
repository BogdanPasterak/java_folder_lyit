package Recursion;

// Bogdan Pasterak L00157106
// 26/02/2021
// Tests whether this sentence is a palindrome. 
public class Sentence {
    private String text;

    // Constructor
    public Sentence(String text) {
        this.text = text;
    }

    // getters and setters
    public String getText() {
        return text;
    }

    // Test palindrome
    // @return true if this sentence is a palindrome, false otherwise
    public boolean isPalindrome() {
        int length = text.length();

        // if length < 2 exit (is palindrome)
        if (length <= 1) {
            return true;
        }

        // First and last character to lovercase
        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(length - 1));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                // check rest of sentence without this characters
                Sentence shorter = new Sentence(text.substring(1, length - 1));
                return shorter.isPalindrome();
            } else {
                return false;
            }
        } else if (! Character.isLetter(last)) {
            // Remove last character
            Sentence shorter = new Sentence(text.substring(0, length - 1));
            return shorter.isPalindrome();
        } else {
            Sentence shorter = new Sentence(text.substring(1));
            return shorter.isPalindrome();
        }
    }

    public void reverseString() {
        char[] arrayText = text.toCharArray();
        recursiveReverseCharacters(arrayText, 0, text.length() - 1);
        text = String.valueOf(arrayText);
    }

    private void recursiveReverseCharacters(char[] arr, int front, int back) {
        if (front >= back) {
            return;
        } else {
            // swap 2 characters
            char temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
            // recursive
            recursiveReverseCharacters(arr, front + 1, back - 1);
        }
    }
}
