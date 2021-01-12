package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String rawString = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term");
        String searchTerm = input.nextLine().toLowerCase();
        String lowerCaseRawString = rawString.toLowerCase();
        Boolean isFound = lowerCaseRawString.contains(searchTerm);
        System.out.println(isFound);

        //Part 2
        Integer index = lowerCaseRawString.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index);
        System.out.println("Your term is  " + length + "characters long");
        //String modifiedString = lowerCaseRawString.repeat(searchTerm. replacement: "");
    }
}
