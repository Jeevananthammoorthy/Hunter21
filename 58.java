import java.util.*;

class 58{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		int index=str1.indexOf(str2.toString());
		if(index==-1)
		{
		    System.out.println("1");
		}else{
	System.out.println(index);
		}
	}
}
