import java.util.*;
public class PrimeFactorization {
    public static void primeFactorization(int n) {
        if (n < 0) {
            System.out.print(-1+" "); 
            n = -n;
        }
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            primeFactorization(n);
            System.out.println(); 
        }
        sc.close();
    }
}
