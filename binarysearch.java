import java.util.Scanner;
public class binarysearch {
    public static int binarys(int arr[],int x)
    {
        int mid=arr.length/2,s=0,e=arr.length;
        while(s<=e)
        {
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]<x)
            {
                s=mid+1;
                mid=(s+e)/2;
            } 
            else
            {
                e=mid-1;
                mid=(s+e)/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println("Index->"+binarys(arr,x));
    }
}
