import java.util.*;

class 13 {
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
	  int size=in.nextInt();
	  int[] ar=new int[size];
	  for(int i=0;i<size;i++)
	  {
	      ar[i]=in.nextInt();
	  }
	  fun(ar);
	}
	static int fun(int arr[])
	{
	  for(int i=0;i<arr.length;i++)
	     if(arr[i]==i)
	     System.out.print(arr[i]);
	     
	     return 0;
	}
}
