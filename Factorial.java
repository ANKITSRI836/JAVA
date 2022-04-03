import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int fact=1;
        while(a!=0)
        {
            fact=fact*a;
            a--;
        }
        System.out.println(fact);
    }
}