import java.util.*;


public class CF2269BKiaKio {
    static long next(long n){
        long sum = 0;
        while (0 < n){
            long digi = n % 10;
            sum += digi * digi;
            n = n / 10;
        }
        return sum;
    }

    static long findStable(long x){
        for (int i = 0; i < 200; i++){
            x = next(x);
        }
        return x;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextLong();
            }
            Map <Long, Integer> map = new HashMap<>();
            for(int i = 0 ; i < n; i++){
                long stable = findStable(arr[i]);
                map.put(stable, map.getOrDefault(stable, 0)+1);
            }
            long pairs = 0;
            for(int count : map.values()){
                pairs = pairs + (long)count * (count - 1)/2;
            }
            System.out.println(pairs);
        }
        sc.close();
    }
}