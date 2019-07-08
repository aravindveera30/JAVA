import java.util.ArrayList;
import java.util.Scanner;

public class Q {

	
	public static void main(String[] args) {
		 
		String b;
		ArrayList a=new ArrayList();
		String c=new String("q");
		for(   ;   ;   )
	      {
		System.out.println("enter");
		Scanner s=new Scanner(System.in);
		b=s.next();
		a.add(b);
	    if( b.equals(c))
		  {
	    System.out.println(a);
	}

}}}