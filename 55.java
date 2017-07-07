import java.util.*;

class 55{
	public static void main (String[] args) {
	    int count=0;
	 Scanner in=new Scanner(System.in);
	 String str1=in.nextLine();
	 String[] str2=str1.split(" ");
	 for(int i=0;i<str2.length;i++)
	 {
	    count=(str1.replaceAll("","")).length()-(str1.replaceAll(str2[i].toString(),"").length());
	   if(count==1){
	     System.out.println(str2[i]);
	     break;
	   }
	 }
	}
}
