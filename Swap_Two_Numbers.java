import java.util.Scanner;
public class Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);
    }
}