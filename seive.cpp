#include <bits/stdc++.h>
#define abdo ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
using namespace std;
#define ll long long
const int N =1e5+5;
vector<bool> isPrime(N,true);
void sieve(){
    isPrime[0]=isPrime[1]=false; // 1 and 0 are not prime
    for(int i=2;i*i<=N;i++){
        if(isPrime[i]){
            for(int j=i*i;j<=N;j+=i){
                isPrime[j] = false;
            }
        }
    }
}
int main(){
    abdo
    sieve();
    int t;
    cin>>t;
    while(t--){
        int x;
        cin>>x;
        if(isPrime[x]){
            cout << x <<"  "<<"is a prime"<< endl;
        }else{
            cout << x <<"  "<<"is not a prime"<< endl;
        }  
    }
    return 0;
}