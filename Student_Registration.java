import java.util.*;
public class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(b-c>=a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}