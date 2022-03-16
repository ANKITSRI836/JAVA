public class Permutation_Combination{
    public static void main(String[] args){
        java.util.Scanner scan=new java.util.Scanner(System.in);
        int n=scan.nextInt();
        int r=scan.nextInt();
        int d=n-r;
        int factn=1,factr=1,factd=1;
        while(n!=0)
        {
            factn=factn*n;
            n--;
        }
        while(r!=0)
        {
            factr=factr*r;
            r--;
        }
        while(d!=0)
        {
            factd=factd*d;
            d--;
        }
        System.out.print("Permutation=");
        System.out.println(factn/factd);
        System.out.print("Combination=");
        System.out.println(factn/(factd*factr));
    }
}