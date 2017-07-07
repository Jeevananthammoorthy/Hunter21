import java.util.*;

class 57 {
	public static void main (String[] args) {
	    int k=0,max=0,count=0;
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String[] str2=str1.split(" |\\.");
		String temp=null;
		for(int i=0;i<str2.length;i++)
		{ 
		  if(str2[i].length()>max)
		  {
		      max=str2[i].length();
		      temp=str2[i];
		  }
		}
		for(int i=0;i<str2.length;i++)
		{   
		    for(int j=i+1;j<str2.length;j++)
		    {  if(j<str2.length){
		        if(str2[i].equals(str2[j]))
		    {
		        count++;
		        break;
		    }}
		    }
		}
		System.out.println(str1.replaceAll(" ",""));//Remove spaces from a string
		System.out.println(temp);//Longest word in a string
		System.out.println(((str1.replaceAll(" ","")).length())-((str1.replaceAll("[e ]","")).length()));//Count value of e
		System.out.println(((str1.replaceAll(" ","")).length())-((str1.replaceAll("[0-9 ]","")).length()));//count number of integers
			System.out.println(count);//count of doubles
		System.out.println(((str1.replaceAll(" ","")).length())-((str1.replaceAll("[ .]","")).length()));//number of words
		System.out.println(str2.length);//number of string
	}
}
