import java.util.*;
public class loss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=a-b;
        float ll=(l/(float)a)*100;
        System.out.printf("%.2f",ll);
    }
}