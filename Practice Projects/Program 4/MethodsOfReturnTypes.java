package www.jagan.learning;
import java.util.*;

public class MethodsOfReturnTypes
{
	public static void main(String[] args)
	{
		int num1,num2;
		System.out.println("enter two numbers");
		Scanner scan= new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		add(num1,num2);
		int res=addInt(num1,num2);
		System.out.println("Addition in int return type is :"+res);
		float f=addfloat(num1,num2);
		System.out.println("Addition in float return type is :"+ f);
		char c=returnchar();
		System.out.println(c);
		
	}
	
	static void add(int num1, int num2)
	{
	
		int result=num1+num2;
		System.out.println("Addition in void return type is : "+result);
	}
	static int addInt(int num1,int num2)
	{
		int result=num1+num2;
		return result;
		
	}
	static float addfloat(float num1,float num2)
	{
		float result=num1+num2;
		return result;
	}
	static char returnchar()
	{
		return 'j';
	}
	
	
	
}
