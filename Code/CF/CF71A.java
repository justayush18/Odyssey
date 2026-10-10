import java.util.Scanner;

public class CF71A {
    public static String wordCompressor(String str){
        if (str.length() <= 10) {
            return str;
        }
        int count = str.length()-2;
        return "" + str.charAt(0) + count + str.charAt(str.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            System.out.println(wordCompressor(str));
        }
        sc.close();
    }
}
