import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),t;
        int b=sc.nextInt();
        while(true)
        {
            System.out.println(b);
            if(b==0)
                break;
            t=b;
            b=a%b;
            a=t;
        }
        System.out.println(a);
    }    
}
