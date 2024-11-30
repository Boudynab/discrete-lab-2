for(const auto& primes:mp1){
        int prime=primes.first;
        if(mp2.find(prime)!=mp2.end()){
            lcm*=pow(primes.first,max(primes.second,mp2[prime]));
        }
    }