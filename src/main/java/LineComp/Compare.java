package LineComp;

import java.util.Scanner;

public class Compare
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st line:-");
        System.out.println("Enter x1 ->");
        int x1=sc.nextInt();
        System.out.println("Enter x2 ->");
        int x2=sc.nextInt();
        System.out.println("Enter y1 ->");
        int y1=sc.nextInt();
        System.out.println("Enter y2 ->");
        int y2=sc.nextInt();

        System.out.println("2nd line:-");
        System.out.println("Enter a1 ->");
        int a1=sc.nextInt();
        System.out.println("Enter a2 ->");
        int a2=sc.nextInt();
        System.out.println("Enter b1 ->");
        int b1=sc.nextInt();
        System.out.println("Enter b2 ->");
        int b2=sc.nextInt();

        System.out.println("length of 1st line="+new Distance().totalDistance(x1,x2,y1,y2));
        System.out.println("length of 2nd line="+new Distance().totalDistance(x1,x2,y1,y2));



    }
}
