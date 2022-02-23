package if_else_switch;

import java.util.Scanner;

public class kilkist_rivnyh_iz_treh {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		if ((k == m) && (k == n)) {
			System.out.println("3");
		}else {
			if (((k == m) && (k != n)) || ((m == n ) && ( m != k)) || ((k == n) && (k != m))){
				System.out.println("2");
			}else {
				if ((k != m) && (k != n)) {
					System.out.println("0");
				}
				}
			}
			}
		

}
