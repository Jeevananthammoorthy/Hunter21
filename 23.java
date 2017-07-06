import java.util.*;

class 23{
	public static void main (String[] args){
		int flag=1;
		Scanner  in=new Scanner(System.in);
		LinkedList<Character> ll=new LinkedList<Character>();
		int size=in.nextInt();
	  for(int i=0;i<size;i++)
		ll.add(in.next().charAt(0));
	  for(int i=0,j=(ll.size()-1);i<ll.size();i++,j--)
	  {
	      if(!(ll.get(i)==ll.get(j)))
	        {  flag=0;
	            System.out.println("Not a  palindrome");
	            break;
	        }
	  }
	  if(flag==1)
	  {
	      System.out.println("palindrome");
	  }
	}
}
