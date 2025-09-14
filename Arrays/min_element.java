import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        Scanner input = new Scanner(System.in);
        // System.out.println(array.length);

        // input
        for (int i = 0; i <= 3 - 1; i++) {
            for (int j = 0; j <= 5 - 1; j++) {
                System.out.print("enter a value for " + i + " " + j + " : ");
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // output
        for (int i = 0; i <= 3 - 1; i++) {
            for (int j = 0; j <= 5 - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // minimum
        int mini = array[0][0];
        for (int i = 0; i <= 3 - 1; i++) {
            for (int j = 0; j <= 5 - 1; j++) {
                if (array[i][j] < mini) {
                    mini = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("minimum is : " + mini);
        
        // index of min
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j] == mini) {
                    System.out.println("Found at: row " + i + ", column " + j);
                }
            }
        }
        input.close();
    }
}
