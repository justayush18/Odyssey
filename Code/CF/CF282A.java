import java.util.Scanner;

public class CF282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        while(0 < n--){
            String str = sc.next();
            if (str.contains("+")) x++;
            else x--;
        }
        System.out.println(x);
    }
}
