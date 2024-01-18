import java.util.Scanner;
import java.lang.Math;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s;
        s=(a+b+c)*0.5;
        System.out.println(String.format("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c))));
    }
}