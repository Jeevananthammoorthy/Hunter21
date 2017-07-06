import java.util.*;

class 38 {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
		    hs.add(ch[i]);
		}
		for(char c:hs)
		    System.out.print(c);
	}
}
