package if_else_switch;

import java.util.Scanner;
import java.lang.Math;

public class ferz {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = x1 - x2;
		int y3 = y1 - y2;
		if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2) || (Math.abs(x3) == Math.abs(y3))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}


