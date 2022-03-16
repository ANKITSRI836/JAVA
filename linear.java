public class linear{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key to search");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}