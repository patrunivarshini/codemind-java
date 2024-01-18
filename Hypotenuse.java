import java.util.Scanner;
import java.lang.Math;
public class Hypotenuse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(String.format("%.2f",Math.sqrt((a*a)+(b*b))));
    }
}