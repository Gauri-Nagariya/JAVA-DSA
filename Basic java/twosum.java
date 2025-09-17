import java.util.*;;

class twosum {
    // public int[] twoSum(int[] nums, int target) {

    // }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("enter lenth or array");
        int n = input.nextInt();

        System.out.print("enter two sum you want: ");
        int x = input.nextInt();


        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            for (int j = i+1; j < list.size()-1; j++) {
                 int y= list.get(j);
                if ((a + y) == x) {
                    System.out.println("["+a+","+ y+"]");
                }
            }
        }
        input.close();
    }
}