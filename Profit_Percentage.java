import java.util.*;
public class pass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=y-x;
        float pp=(p/(float)x)*100;
        System.out.printf("%.2f",pp);
    }
}