package JavaPrograms;

public class StringReverse 
{
 public static void main(String[] args)     /// we can do it by two ways: by for loop and string buffer
 {
	 
	 String Name = "AnandHooda";
	 int Stringlength = Name.length();
	 System.out.println(Stringlength);
	 String reverse = "";
	 
	 for(int i =Stringlength-1;i>=0;i--)
	 {
		 
		 reverse = reverse+ Name.charAt(i);
	 }
	 //System.out.println(reverse);
 


// 2nd way 

StringBuffer Reverse = new StringBuffer(Name);
//StringBuffer Reversevalue = NReverse.reverse();
System.out.println(Reverse.reverse());
 }
 }