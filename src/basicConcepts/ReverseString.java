package basicConcepts;

public class ReverseString 

{
public static void main(String[] args)
{
	
	
	String  name = "Jitender";    // rednetij
	
	System.out.println(name);
	
	String reverse = "";
	
	int L =name.length();
	
	for(int i=L-1; i>=0;i--)
	{
		reverse = reverse + name.charAt(i);
		
	
	}
	System.out.println(reverse);
	
}


	
}
