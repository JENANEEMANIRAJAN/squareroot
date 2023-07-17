package validsqrroot;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(sqr(a)==1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static int sqr(int b) {
		for (int i=1; i*i<=b; i++) {
			if((b%i==0) && (b/i==i))
					{
					return b;
					}
		}
			return 1;
		
	}
}

