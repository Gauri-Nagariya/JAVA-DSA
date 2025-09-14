import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
         int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        // int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = input.nextInt();
            arr[i] = a;
        }


        //assuming first element is sorted 
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        System.out.print("sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
