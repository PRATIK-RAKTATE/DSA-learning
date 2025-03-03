import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();  // Reads a single word

        System.out.print("Enter a full sentence: ");
        scanner.nextLine();  // Consume the leftover newline
        String sentence = scanner.nextLine();  // Reads entire line

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Reads an integer

        System.out.print("Enter a decimal number: ");
        float decimal = scanner.nextFloat();  // Reads a float

        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();  // Reads a boolean

        System.out.println("\nYou entered:");
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Integer: " + number);
        System.out.println("Float: " + decimal);
        System.out.println("Boolean: " + boolValue);

        scanner.close();
    }
}
