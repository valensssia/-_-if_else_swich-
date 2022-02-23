package if_else_switch;

import java.util.Scanner;

public class skladne_rivnanya {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if ((a == 0) || (b == 0)) {
			System.out.println("INF");
			}else{
				if ((a == 0) || (b * c == a * d)) {
					System.out.println("NO");
				}else {
					if (b % a == 0) {
						System.out.println(-b / a);
					}else {
						System.out.println("NO");
					}
					}
				}
			}
		

}
