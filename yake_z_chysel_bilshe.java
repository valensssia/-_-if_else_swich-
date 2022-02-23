package if_else_switch;

import java.util.Scanner;

public class yake_z_chysel_bilshe {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
        	System.out.println("1");
        	}else{
            	if (b > a){
                System.out.println("2");
            }else{
                System.out.println("0");
            }
        
        }

    }
}


