import java.util.*;

class 45{
	public static void main (String[] args) {
	 Scanner in=new Scanner(System.in);
	 String str=in.nextLine();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
          hs.add(new Character(str.charAt(i)));
       
           if((str.length()-hs.size())%2==0)
           System.out.println("Double String");
           else
           System.out.println("Not a Double String");
           	}
}
