import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Please, input any word to verify if is palindrome: " );
        String strToVerify = inputValue.next();
        String strToVerifyLower = strToVerify.toLowerCase(); //convert string to lower case

        char[] arrayOfChars = strToVerifyLower.toCharArray(); //division of string to symbols into array

        isPalindrome(arrayOfChars);
        System.out.print("TO GIT" );

    }
    static boolean isPalindrome(char[] array){
        for (int i = 0, j = array.length - 1; i < (array.length / 2); i++, j--) {
            if (array[i] != array[j])
            {
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("String is palindrome");
        return true;
    }
}