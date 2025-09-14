//move all x to the end 
public class moving_char_at_end {
    public static void sorted(String str, int index, String newString, int count){
        if (index == str.length()) {
            for(int i = 0; i<count; i++){
                newString = newString+'x';
            }
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        if (current == 'x') {
            count++;
            sorted(str, index+1, newString,count);
        }else{
            newString += current;
            sorted(str, index+1, newString,count);
        }
    }
    public static void main(String[] args) {
     String str = "axbedxsbexr";
    //  int count =0;
     sorted(str, 0, "", 0);
    }
}
