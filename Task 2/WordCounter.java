import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to count the words:");
        String text = scanner.nextLine();
        String[] words = text.split("[\\p{Punct}\\s]+");
        int count = words.length;
        System.out.println("The total number of words in the text is: " + count);
    }
}
