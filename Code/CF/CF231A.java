import java.util.Scanner;

public class CF231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n-- > 0){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            if (first + second + third >= 2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
