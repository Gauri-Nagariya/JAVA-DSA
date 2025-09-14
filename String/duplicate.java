import java.util.Scanner;

class duplicate {
    public static void main(String[] args) {
        String result = "";
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string : ");
        String a = input.nextLine();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }

        }
        System.out.println("result : " + result);

        input.close();
    }
}
