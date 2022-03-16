import java.lang.Math;
public class Armstrong{
    public static void main(String[] args){
        java.util.Scanner scan= new java.util.Scanner(System.in);
        int a=scan.nextInt();
        int n=a,sum=0,count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        n=a;
        while(n!=0)
        {
            int p=(int)Math.pow((n%10),count);
            sum=sum+p;
            n=n/10;
        }
        if(sum==a)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }

    }
}