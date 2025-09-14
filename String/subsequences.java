public class subsequences {

    public static void print_subsequences(String str, int index, String newString){

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        //to be add
        print_subsequences(str, index+1, newString+current);
        //not to be add
        print_subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str = "abcd";
        print_subsequences(str, 0, "");
    }
}
