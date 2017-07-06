import java.util.*;

class 41{
	public static void main (String[] args) {
	    int sum=0,pro=1,max=1;
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++){
		for(int j=i;j<size;j++)
		{
		    pro*=arr[j];
		}
		if(pro>max){
		max=pro;
		}
		pro=1;
		}
		System.out.println(max);
	}
}
