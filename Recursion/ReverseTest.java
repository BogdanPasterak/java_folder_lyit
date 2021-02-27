package Recursion;

public class ReverseTest {
    public static void main(String[] args) {
        String[] texts = {  "Eva, can I see bees in a cave?",
                            "Bogdan Pasterak, L00157106",
                            "I love creating algorithms"};
        

        for (String text : texts) {
            Sentence sentence = new Sentence(text);
            boolean test = true;
            String start = sentence.getText();

            // Use StringBuilder function to create reverse
            String reverse = new StringBuilder(start).reverse().toString();

            // test reverse
            sentence.reverseString();
            if (! reverse.equals(sentence.getReverseText())) {
                test = false;
            }
            // test again, two reverse = origin
            sentence.reverseString(sentence.getReverseText());
            if (! sentence.getText().equals(sentence.getReverseText())) {
                test = false;
            }
            // print result
            if (test) {
                System.out.println("Test pass");
            } else {
                System.out.println("Test fail !!!");
            }
        }
    }
}
