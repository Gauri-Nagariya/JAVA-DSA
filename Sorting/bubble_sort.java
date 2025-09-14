import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,7};
        System.out.print("unsorted array : ");
       System.out.print(Arrays.toString(arr));

        //for n-1  times 
        for(int i =0; i<= arr.length-1; i++){
            //for excluding sorted elements form end, we iterate again
            for(int j=0; j<=arr.length-1-j; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        //print sorted array
        System.out.println();
        System.out.print("bubble sort- sorted array : ");
        System.out.println(Arrays.toString(arr));
    }
}
