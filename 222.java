import java.util.*;

class 222{
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	       ArrayList<Integer> al=new ArrayList<Integer>();
	       for(int i=0;i<5;i++)
	       {
	           al.add(in.nextInt());
	       }
	       int size=in.nextInt();
	       Collections.reverse(al);
	       System.out.println(al.get(3)+"  "+al.get(size-1));
	       
	}
}
