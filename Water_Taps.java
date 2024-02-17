import java.util.Scanner;
public class Tank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        int d=c/a;
        int e=c/b;
        System.out.println(c/(d+e));
    }
}