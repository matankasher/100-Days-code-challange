import java.util.*;
public class Main
{
    public static int Fibonacci(int pos)
    {
        if (pos == 1 || pos == 2)
            return 1;
        return Fibonacci(pos -1) + Fibonacci(pos -2);
    }
    
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter the index in Fibonacci seires that you want to see : ");
		System.out.println("the Number is:" +Fibonacci(reader.nextInt()));
	}
}
