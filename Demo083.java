import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        if(input.isEmpty()){
            System.out.println("The string is empty.");
        } else {
            char firstChar = Character.toLowerCase(input.charAt(0));

            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                System.out.println("The first character is a vowel.");
            } else if (Character.isLetter(firstChar)) {
                System.out.println("The first character is a consonant.");
            } else {
                System.out.println("The first character is not a letter.");
            }
        }

        scanner.close(); 
    }
}