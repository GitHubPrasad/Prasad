package InterviewPrograms;

public class SwappingTwoNumbers 
{

	public static void main(String[] args) 
	{
		int a = 10, b = 20;
		
		System.out.println("Before swapping values are: "+a+" "+b);
		
		//Logic: using Third variable
		int t = a;
		a = b;
		b = t;

		System.out.println("After swapping values are: "+a+" "+b);
	}

}
