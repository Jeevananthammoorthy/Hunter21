import java.util.*;

class 34{
	public static void main (String[] args) {
	    int pro=1;
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int tar=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		arr[i]=in.nextInt();
		
		for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++)
		{  if((arr[i]+arr[j])==tar)
		    {
		      System.out.print(arr[i]+"  "+arr[j]);
		      System.out.println();
		    }
		}
		}
		
	}
}
