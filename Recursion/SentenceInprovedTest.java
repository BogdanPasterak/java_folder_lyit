package Recursion;

public class SentenceInprovedTest {
    public static void main(String[] args) {

        String palindrome1 = "Eva, can I see bees in a cave?";
        String palindrome2 = "Red rum, sir, is murder";
        String palindrome3 = "Borrow or rob?";
        String noPalindrome1 = "Implement the improved isPalindrome()";
        String noPalindrome2 = "noPalindrome2";
        
        SentenceInproved sentence;
        boolean answer;

        sentence = new SentenceInproved(palindrome1);
        answer = sentence.isPalindrome(0, sentence.getLength() - 1);
        System.out.println("Palindrome - " + palindrome1 + " => " + answer);

        sentence = new SentenceInproved(palindrome2);
        answer = sentence.isPalindrome(0, sentence.getLength() - 1);
        System.out.println("Palindrome - " + palindrome2 + " => " + answer);

        sentence = new SentenceInproved(palindrome3);
        answer = sentence.isPalindrome(0, sentence.getLength() - 1);
        System.out.println("Palindrome - " + palindrome3 + " => " + answer);

        sentence = new SentenceInproved(noPalindrome1);
        answer = sentence.isPalindrome(0, sentence.getLength() - 1);
        System.out.println("Sentence - " + noPalindrome1 + " => " + answer);

        sentence = new SentenceInproved(noPalindrome2);
        answer = sentence.isPalindrome(0, sentence.getLength() - 1);
        System.out.println("Sentence - " + noPalindrome2 + " => " + answer);
    }
   
}
