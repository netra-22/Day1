package training;
import java.util.*;
public class prac_1 {
	public static boolean ispalin(int n) {
		int t=n;
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		return t==rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(ispalin(num)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
