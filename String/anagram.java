import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();

        //change string to array with its letters - array of characters 
        char[] a1 =  a.toCharArray();
        char[] b1 =  b.toCharArray();

        //sort bith arrays
        Arrays.sort(a1);
        Arrays.sort(b1);

        //check condition if both are equal or not
        if (Arrays.equals(a1, b1)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
input.close();
    }
}
