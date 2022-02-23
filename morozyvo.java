package if_else_switch;

import java.util.Scanner;

public class morozyvo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if ((k % 3 == 0) || (k % 5 == 0)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		}
		

}
