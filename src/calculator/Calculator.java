package calculator;

public class Calculator {
	public static void main(String[] args)
	{
		//Uses command line args for input.
		int n1=0,op=0,n2=0,ans=0;
		
		
		if(args.length == 3)
		{
			n1=Integer.parseInt(args[0]);
			//This is necessary since * needs either a backslash or single quotes to be interpreted in the command line.
			if(args[1].length() == 1)
				op= (int)args[1].charAt(0);
			else
				op= (int)args[1].charAt(1);
			n2=Integer.parseInt(args[2]);
		}
		
		else
		{
			System.out.println("Invalid Input! Must be 3 arguments in the form: Num1 Operator Num2");
			return;
		}
		
		
		switch(op)
		{
			//Multiply
			case 42:
			{
				ans=n1*n2;
				break;
			}
			//Add
			case 43:
			{
				ans=n1+n2;
				break;
			}
			//Subtract
			case 45:
			{
				ans=n1-n2;
				break;
			}
			//Divide
			case 47:
			{
				if(n2==0)
				{
					//Terminate program if division by 0
					System.out.println("Cannot Divide by Zero!");
					return;
				}
				ans=n1/n2;
				break;
			}
			
			default:
			{
				//Terminate program if invalid operator used.
				System.out.println("Invalid Operator, must be \'+\',\'-\',\'*\' or \'/\'!");
				return;
			}
			
		}
		System.out.println(ans);
	}

}
