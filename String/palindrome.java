import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String n = input.nextLine();
        boolean condition = true;
        for(int i = 0; i<= (n.length()-1); i++){
            if (n.charAt(0 + i) == n.charAt((n.length()-1)-i)) {
                condition = true;
            }else{
                condition = false;
            }
        }
        if (condition) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
