import java.util.*;
public class gcdandlcmcouputationparta {
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
        }
        sc.close();
    }   
}
