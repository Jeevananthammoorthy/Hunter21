import java.util.*;

class 56{
	public static void main (String[] args) {
	    int minus=0;
	  Scanner in=new Scanner(System.in);
	  int index;
	  int size=in.nextInt();
	  int[] array1=new int[size];
	  for(index=0;index<size;index++)
	   array1[index]=in.nextInt();
	   Arrays.sort(array1);
	   int mindiff=array1[1]-array1[0];
	   for(index=1;index<size;index++)
	           { if(index+1<size)
	              minus=array1[index+1]-array1[index];
	             if(minus<mindiff)
	             {
	                 mindiff=minus;
	             }
	           }
	           System.out.println(Math.abs(mindiff));
	}
}
