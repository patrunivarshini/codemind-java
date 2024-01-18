import java.util.Scanner;
public class Days{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n/365);
        System.out.println((n%365)/7);
    }
}