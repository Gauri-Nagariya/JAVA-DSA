//remove duplicate from array

import java.util.Scanner;

public class remove_duplicate {
     public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        // int[] result = new;
        int[] result = new int[arr.length];
        int k = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter a value for index "+ i +" : ");
            int a = input.nextInt();
            arr[i] = a;
        }
        
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j <k; j++) {
                if (arr[i] == result[j]) {
                    duplicate=true;
                   break;
                }
            }
            count++;
            if(!duplicate){
                result[i] = arr[i];
                k++;
            }
        }

        System.out.println();
        for (int i = 0; i < k; i++) {
         System.out.print(result[i]+" = "+ count + ", ");
     }
         
 
         input.close();
     }
}

