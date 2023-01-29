// You are using Java
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,i,t=9;
	    int sum =0;
	    int k = 9;
	    Scanner s =  new Scanner(System.in);
	    n=s.nextInt();
	    for (i=0;i<n;i++)
	    { 
	        sum += t;
	        System.out.println(t);
	        t = k + t*10;
    	}
        System.out.println(sum);
    }
} 
