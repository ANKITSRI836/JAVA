public class Fibonacci{
    public static void main(String[] args){
        java.util.Scanner scan=new java.util.Scanner(System.in);
        int n=scan.nextInt();
        if(n==1)
        {
            System.out.println(0);
        }
        else if(n==2)
        {
            System.out.println(1);
        }
        else
        {
            int a=0,b=1,s=a+b;
            System.out.println(0);
            System.out.println(1);
            while((n-2)!=0)
            {
                System.out.println(s);
                a=b;
                b=s;
                s=a+b;
                n--;
            }
        }
    }
}