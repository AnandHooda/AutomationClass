package JavaPrograms;

public class RemoveSplCharFromString {
	public static void main(String[] args)     //   remove spl char by using regular expression
	{
		String ss = "Anan@#$%#d H@#!~oo@*&d^%^a";
		
		ss = ss.replaceAll("[^a-zA-Z0-9]", "");
		
		
		
		int value = 850412;
		
		int rev = 0;
		
		while(value!=0)
		{
			rev = rev*10+value%10;
			value= value/10;
		}
		
		int a=5;
		int b= 6;
		
		a=a+b;      // a=11
		b=a-b;      // b= 5
		a= a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(rev);
		System.out.println(ss);
	 }

}
