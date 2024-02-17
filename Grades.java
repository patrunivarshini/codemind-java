import java.util.*;
public class Grades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        if((a+b+c+d+e)/5>=90){
            System.out.println("Grade A");
        }
        else if((a+b+c+d+e)/5>=80){
            System.out.println("Grade B");
        }
        else if((a+b+c+d+e)/5>=70){
            System.out.println("Grade C");
        }
        else if((a+b+c+d+e)/5>=60){
            System.out.println("Grade D");
        }
        else if((a+b+c+d+e)/5>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}