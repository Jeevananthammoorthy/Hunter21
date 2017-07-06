import java.util.*;

class 37{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		StringBuffer sb1=new StringBuffer(str);
		String sb2=null;
		for(int i=0;i<str.length();i++)
		{
		    sb2=sb1.substring(i,str.length());
		    StringBuffer sb3=new StringBuffer(sb2);
		    if(!(sb3.toString().equals(sb3.reverse().toString())))
		    {
		        System.out.println(sb2.length());
		        break;
		    }
		}
	}
}
