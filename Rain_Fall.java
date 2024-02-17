import java.util.*;
public class Rain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3){
            System.out.println("LIGHT");
        }
        if(n>=3 && n<7){
            System.out.println("MODERATE");
        }
        if(n>=7){
            System.out.println("HEAVY");
        }
    }
}