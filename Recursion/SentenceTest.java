package Recursion;

public class SentenceTest {
    public static void main(String[] args) {

        String palindrome1 = "Eva, can I see bees in a cave?";
        String palindrome2 = "Red rum, sir, is murder";
        String palindrome3 = "Borrow or rob?";
        String noPalindrome1 = "Implement the improved isPalindrome()";
        String noPalindrome2 = "noPalindrome2";
        
        Sentence sentence;
        boolean answer;

        sentence = new Sentence(palindrome1);
        answer = sentence.isPalindrome();
        System.out.println("Palindrome - " + palindrome1 + " => " + answer);

        sentence = new Sentence(palindrome2);
        answer = sentence.isPalindrome();
        System.out.println("Palindrome - " + palindrome2 + " => " + answer);

        sentence = new Sentence(palindrome3);
        answer = sentence.isPalindrome();
        System.out.println("Palindrome - " + palindrome3 + " => " + answer);

        sentence = new Sentence(noPalindrome1);
        answer = sentence.isPalindrome();
        System.out.println("Sentence - " + noPalindrome1 + " => " + answer);

        sentence = new Sentence(noPalindrome2);
        answer = sentence.isPalindrome();
        System.out.println("Sentence - " + noPalindrome2 + " => " + answer);
    }
}