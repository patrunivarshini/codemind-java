import java.util.Scanner;
public class Color{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if(s=='V'){
            System.out.println("Violet");
        }
        else if(s=='I'){
            System.out.println("Indigo");
        }
        else if(s=='B'){
            System.out.println("Blue");
        }
        else if(s=='G'){
            System.out.println("Green");
        }
        else if(s=='Y'){
            System.out.println("Yellow");
        }
        else if(s=='O'){
            System.out.println("Orange");
        }
        else if(s=='R'){
            System.out.println("Red");
        }
        else{
            System.out.println("-1");
        }
    }
}