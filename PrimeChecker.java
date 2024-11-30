import java.util.*;

public class PrimeChecker {
    static final int N = 100005;
    static boolean[] isPrime = new boolean[N];
    public static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; 
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sieve();
        int num = scanner.nextInt();
        while (num!= 0) {
            if (isPrime[num]) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
                }
            num = scanner.nextInt();
            }
        scanner.close(); 
    }
}