import java.util.Scanner;
public class Digits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.printf("%02d",y%100);
    }
} 