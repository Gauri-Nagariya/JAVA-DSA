// read 'n' lines of input until you reach EOF, then number and print all 'n' lines of content.

import java.util.*;

public class indexing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(num + " "+ line);
            num++;
        }
        input.close();
    }
}