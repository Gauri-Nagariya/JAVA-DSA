import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("enter string :");
       String s = input.nextLine();

       String reversed = "";
       for(int i = s.length()-1; i>=0; i--){
        reversed = reversed + s.charAt(i);
       }
       System.out.println("reversed string : "+ reversed);
    }
}
