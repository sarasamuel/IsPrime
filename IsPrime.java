import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Prompt the user to input an integer. 
		
		System.out.println("Enter an integer value:");
	
		int n = in.nextInt();
		
		//Print the results. 

		 if (isPrimeNumber(n)) 
		   {
	           System.out.println(n + " is a prime number.");
	       } 
	     else 
	       {
	           System.out.println(n + " is not a prime number.");
	       }
	}
		
		//Calculate whether the integer is prime. 
		
		public static boolean isPrimeNumber(int n) 
		    {
		       if (n <= 1)
		      {
		           return false;
		      }
		       for (int i = 2; i <= Math.sqrt(n); i++) 
		          {
		           if (n % i == 0) {
		               return false;
		          }
	        }
	        return true; 
      }
}
