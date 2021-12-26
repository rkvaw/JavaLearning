package satsession;
import java.util.*;
public class Fizbuzz {
public static void main(String[] args) {
System.out.println("Please enter the max num limit for fizbuzz");
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
fizzy(num);
scan.close();
	}
public static void fizzy(int num) {
for (int i = 1 ; i<=num;i++)
{
	if (i%3==0 && i%5==0)
	{
		System.out.println("FizzBuzz");
	}
	else if (i%3==0 )
	{
		System.out.println("Fizz");
	}
	else if (i%5==0)
	{
		System.out.println("Buzz");
	}
	else
	{
		System.out.println(i);
	}
}
}}
