import java.util.*;

class GCDFinder 
{
	
	static int gcd(int a, int b) 
	{
		if (b == 0) return a;
		return gcd(b, a % b);
	}	
	
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the values");
		int v1=sobj.nextInt();
        int v2=sobj.nextInt();
        
        int ans = gcd(v1, v2);
        System.out.println(ans);
	}
}