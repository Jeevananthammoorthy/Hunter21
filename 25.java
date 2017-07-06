import java.util.*;

class 25 {
	public static void main (String[] args){
	    int max=0,sum=0,start=0,stop=0;
		Scanner  in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		    arr[i]=in.nextInt();
		    for(int j=0;j<size;j++)
		     for(int i=j;i<size;i++)
		          {
		              sum+=arr[i];
		              if(sum>max)
		              {
		                  start=j;
		                  stop=i;
		                  max=sum;
		              }
		          }
		      for(int i=start;i<=stop;i++)
		      System.out.print(arr[i]+" ");
	}
}
