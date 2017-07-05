import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	       int size1=in.nextInt();
	       int size2=in.nextInt();
	       String[] ar1=new String[size1];
	       String[] ar2=new String[size2];
	       for(int i=0;i<size1;i++)
	       { ar1[i]=in.next();
	       }
	       for(int i=0;i<size2;i++)
	       { ar2[i]=in.next();
	       }
	    List<String> a1=(Arrays.asList(ar1));
	    List<String> a2=(Arrays.asList(ar2));
	    
            System.out.println(a2.containsAll(a1));
	}
}
