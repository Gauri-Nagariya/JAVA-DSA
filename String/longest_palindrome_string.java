import java.util.Scanner;

public class longest_palindrome_string {
    public static void main(String[] args) {

        //Longest Palindromic Substring
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string : ");
        String a = input.nextLine();
        boolean check = true;
        String sub;
        String longest = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(a.length()-1)) {
                check = true;
            }
        }
        



        input.close();
    }
}