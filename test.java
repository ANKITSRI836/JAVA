import java.util.Scanner;
 class A
 {
     int a,b;
     void input()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter first number");
         a=sc.nextInt();
         System.out.println("enter second number");
         b=sc.nextInt();
     }
 }
 class B extends A
 {
     void add()
     {
         System.out.println("addition"+(a+b));
     }
 }
 class C extends A
 {
     void sub()
     {
         System.out.println("substraction="+(a-b));
     }
 }
 class test
 {
     public static void main(String args[])
     {
        B aa=new B();
        C bb=new C();
        aa.input();
        aa.add();
        bb.sub();
     }
 }