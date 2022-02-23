package if_else_switch;

import java.util.Scanner;

public class testuycha_systema {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x == y) || (x / 11 == 1)) {
			System.out.println("YES");
		}else {
			if ((x > 1) && (y > 1)) {
				System.out.println("YES");
			}else {
			System.out.println("NO");
			}
		}
		}
		}


