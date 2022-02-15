import java.util.Scanner;

public class Name {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = (c * 100 + d - a * 100 - b)/ 100;
		int f = (c * 100 + d - a * 100 - b) % 100;
		System.out.println(e + " " + f);
	}
}
