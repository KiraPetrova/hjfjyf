import java.util.Scanner;
public class dzz {
    public static void main (String[] args) {
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        String b = "";
        while (a>0){
            b = a%2 + b;
            a /= 2;
        }
        System.out.println(b);
    }
}
