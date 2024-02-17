import java.util.Scanner;
import java.lang.Math;
public class Sphere{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double c=(4.0/3.0)*(3.14)*n*n*n;
        System.out.printf("%.2f",c);
    }
}