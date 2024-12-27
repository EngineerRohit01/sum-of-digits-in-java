import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter no : ");
	int num = input.nextInt();
	
	int sum=0,remainder;
	while(num>0){
	remainder = num%10;
	sum = sum+remainder;
	num = num/10;	
	}
	System.out.print(sum);
	}
}