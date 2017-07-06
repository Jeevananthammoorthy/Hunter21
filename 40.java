import java.util.*;

class 40{
	public static void main (String[] args) {
	    int sum=0;
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		for(int i=0;i<str.length();i++)
		sum+=Character.getNumericValue(str.charAt(i));
		String ss=String.valueOf(sum);
		StringBuffer sb=new StringBuffer();
		sb.append(sum);
		if((sb.reverse()).toString().equals(ss))
		{
		    System.out.println("Palindrome");
		}
		else
		System.out.println("Not a palindrome");
	}
}
