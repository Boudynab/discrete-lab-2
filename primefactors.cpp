#include <bits/stdc++.h>
#define abdo ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
using namespace std;
#define ll long long
void primeFactorization(int n) {
    if (n < 0) {
        cout << -1 << " "; // Print -1 for negative input
        n = -n;
    }
    for (int i = 2; i * i <= n; i++) {
        while (n % i == 0) {
            cout << i << " ";
            n /= i;
        }
    }
    if (n > 1) {
        cout << n << " "; // Last prime factor
    }
}
int main() {
    abdo;
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        primeFactorization(n);
        cout << endl; 
    }
    return 0;
}
