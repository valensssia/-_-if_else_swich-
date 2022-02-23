package if_else_switch;

import java.util.Scanner;

public class korol {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		  int x2 = sc.nextInt();
		  int y1 = sc.nextInt();
		  int y2 = sc.nextInt();
		  int x3 = x1 - x2;
		  int y3 = y1 - y2;
		  if ((-1 <= x3) && (x3 <= 1)){
		  if ((-1 <= y3) && (y3 <= 1)){
		  System.out.println("Yes");
		  }else{
		  System.out.println("No");
		  }
		  }
		  }
		}


