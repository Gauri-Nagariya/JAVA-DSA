public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,7};
        System.out.print("unsorted array : ");
        for(int i =0 ; i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        //for n-1  times 
        for(int i =0; i<arr.length-1; i++){
           int small = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[small] > arr[j]) {
                    small =j;
                }
            }
            //swap
            int temp = arr[small];
            arr[small]= arr[i];
            arr[i]= temp;
        }
        //print sorted array
        System.out.println();
        System.out.print("selection sort - sorted array : ");
        for(int i =0 ; i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
