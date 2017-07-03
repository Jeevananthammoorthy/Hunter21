import java.util.*;

class Bit{
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
	  int mcount=0,mans=0,count=0,fcount=0;
	  int a=in.nextInt();
	  int b=in.nextInt();
	  for(int i=a;i<=b;i++)
	  {
	      int temp1=Integer.parseInt(Integer.toString(i,2));
	      int aa=temp1;
	     while(temp1>0)
	     {
	         mans=temp1%10;
	         if(mans==1)
	         mcount++;
	         temp1/=10;
	     }
	    
	     for(int j=1;j<=a;j++)
	     {
	         if(mcount%j==0)
	          count++;
	     }
	     if(count==2)
	       {
	           fcount++;
	       }
	      mcount=0;
	      count=0;
	      
	  }
	  System.out.println(fcount);
	}
}
