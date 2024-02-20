import java.util.Scanner;
public class dragon{
    static boolean divNum(int n) {
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < n; j++) {
            if ((i % 2 == 0) && (j % 2 == 0) && (i + j == n)) {
                return true;
            }
        }
    }
    return false;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(divNum(n) ? "YES" : "NO");
    }
}