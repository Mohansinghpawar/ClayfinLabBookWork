import java.util.Scanner;  
public class PositiveOrNegativeNum
{  
public static void main(String[] args)   
{  
int num;   
Scanner input = new Scanner(System.in);  
System.out.print("Enter a number: ");  
num = input.nextInt();  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}  
