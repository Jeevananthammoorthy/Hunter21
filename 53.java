import java.util.*;

class 53{
	public static void main (String[] args) {
	    int k=0;
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String[] str2=str1.split("[a-z]");
		String[] str3=str1.split("[0-9]");
		for(int i=0;i<str2.length;i++)
		{   if(!(str2[i].equals(""))){
		    for(int j=Integer.parseInt(str2[i]);j>0;j--)
		    { 
		        System.out.print(str3[k]);
		    }
		    k++;
		}
		}
	}
}
