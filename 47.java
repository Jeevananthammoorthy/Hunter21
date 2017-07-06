import java.util.*;

class 47{
	public static void main (String[] args) {
	    int count=0,max=1;
	    char ch=0;
	 Scanner in=new Scanner(System.in);
	 String str=in.nextLine();
       char[] c=str.toCharArray();
       Arrays.sort(c);
       if((str.length()-1)%2==0)
       {
           System.out.println(ch);
       }else{
       for(int i=0;i<c.length;i++)
       { for(int j=0;j<c.length;j++)
       {
           if(i!=j&&c[i]==c[j])
           {
               count++;
           }
           if(count>max)
           { max=count;
               ch=c[i];
               flag=0;
           }
       }
       }
       }
       System.out.println(ch);
           	}
}
