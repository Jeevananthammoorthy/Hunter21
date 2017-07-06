import java.util.*;

class 43{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
            char[] ch=str.toCharArray();
            int count=1;
            ArrayList<Integer> al=new ArrayList<Integer>();
            
            for(int i=0;i<ch.length;i++)
            al.add(Character.getNumericValue(ch[i]));
            al.add(0);
            for(int i=0;i<al.size()-1;i++)
            {  
                if(al.get(i)==al.get(i+1)){
                count++;
                }
                else{
                switch(al.get(i))
                {
                    case 2:
                    System.out.print((char)(96+count));
                    break;
                    case 3:
                    System.out.print((char)(99+count));
                    break;
                    case 4:
                    System.out.print((char)(101+count));
                    break;
                    case 5:
                    System.out.print((char)(104+count));
                    break;
                    case 6:
                    System.out.print((char)(107+count));
                    break;
                    case 7:
                    System.out.print((char)(110+count));
                    break;
                    case 8:
                    System.out.print((char)(114+count));
                    break;
                    case 9:
                    System.out.print((char)(118+count));
                      count=1;
                }
                }
              
            }
	}
}
