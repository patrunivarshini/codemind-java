import java.util.Scanner;
public class Hours{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int h,m,sec;
        h=s/3600;
        m=(s%3600)/60;
        sec=(s%60);
        System.out.println("H:M:S"+"-"+h+":"+m+":"+sec);
    }
}