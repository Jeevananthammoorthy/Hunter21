import java.util.*;

class 32{
	public static void main (String[] args) {
	    int pro=1;
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		arr[i]=in.nextInt();
		
		for(int i=0;i<size;i++)
		for(int j=i;j<size;j++)
		{ if((j+1)<size){
		    pro*=arr[j];
		    if(pro==arr[j+1])
		    { 
		        for(int k=i;k<j+1;k++)
		        {
		            System.out.print(arr[k]+" ");
		        }
		         pro=1;
		         break;
		    }
		    System.out.println();
		}
		
	}
}}
