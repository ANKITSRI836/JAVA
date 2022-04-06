import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i=1,j=1,d=a,e;
        int b=sc.nextInt();
        e=b;
        while(true)
        {
            if(d==e)
                break;
            else if(e>d)
            {
                i++;
                d=b*i;
            }
            else
            {
                j++;
                e=a*j;
            }
        }
        System.out.println(d);
    }
}
