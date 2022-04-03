/* package codechef; // don't place package name! */

/* Name of the class has to be "Main" only if the class is public. */
class bottle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int t,n,x,k,count=0;
		t=sc.nextInt();
		while(t!=0)
		{
		    t--;
		    n=sc.nextInt();
		    x=sc.nextInt();
		    k=sc.nextInt();
		    if(x>k)
		        System.out.println(0);
		    else
		    {
		        while(k!=0)
		        {
		            if(count==n)
		                break;
		            k=k-x;
		            count++;
		        }
		        System.out.println(count);
		    }
		}
	}
}
