#include <bits/stdc++.h>
#define abdo ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
using namespace std;
#define ll long long
void factor(int n,map<int,int>&mp){
    for(int i=2;i*i<=n;i++){
        while(n%i==0){
            mp[i]++;
            n/=i;
        }
        if(n>1){
            mp[n]++;
        }
    }
}
void compute(int a,int b){
        map<int,int> mp1,mp2;
        factor(a,mp1);
        factor(b,mp2);
    int gcd=1;
    for(const auto& primes:mp1){
        int prime=primes.first;
        if(mp2.find(prime)!=mp2.end()){
            gcd*=pow(prime,min(primes.second,mp2[prime]));
        }
    }
    int lcm=1;
     for(const auto& primes:mp1){
        int prime=primes.first;
        if(mp2.find(prime)!=mp2.end()){
            gcd*=pow(prime,max(primes.second,mp2[prime]));
        }
    }
    cout<<gcd<<" "<<lcm<<endl;
}
    int main(){
        abdo
        int t;
        cin>>t;
        while(t--){
            int a,b;
            cin>>a>>b;
            compute(a,b);
        }
        return 0;
    }