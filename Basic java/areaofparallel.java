import java.util.*;

public class areaofparallel {

static int B;
static int H;
static boolean flag;

//using static initialization block

static {
    Scanner input = new Scanner(System.in);
     B = input.nextInt();
     H = input.nextInt();
    input.close();
if(B > 0 && H > 0){
    flag = true;
}else{
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

