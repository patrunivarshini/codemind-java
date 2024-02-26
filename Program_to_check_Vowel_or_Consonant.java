import java.util.*;
public class Consonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='A'||n=='E'|| n=='I'||n=='O'  ||n=='U'||n=='a'||n=='e'|| n=='i'||n=='o'  ||n=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}