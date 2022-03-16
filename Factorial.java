public class Factorial{
    public static void main(String[] args){
        java.util.Scanner scan=new java.util.Scanner(System.in);
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