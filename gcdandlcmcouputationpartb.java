import java.util.*;

public class gcdandlcmcouputationpartb {
    public static void factor(int n,Map<Integer,Integer>mp){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                mp.put(i,mp.getOrDefault(i,0)+1);
                n/=i;
            }
        }
        if(n>1){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
    }
    public static void compute(int a,int b){
        Map<Integer,Integer>mp1=new HashMap<>();
        Map<Integer,Integer>mp2=new HashMap<>();
        factor(a,mp1);
        factor(b,mp2);
        int gcd=1;
        for(Map.Entry<Integer,Integer>entry:mp1.entrySet()){
            int prime =entry.getKey();
            if (mp2.containsKey(prime)){
                gcd*=(int)Math.pow(prime,Math.min(entry.getValue(),mp2.get(prime)));
            }
        }
        int lcm=1;
        Map<Integer,Integer>combined =new HashMap<>(mp1);
        for(Map.Entry<Integer,Integer> entry : mp2.entrySet()){
            int prime = entry.getKey();
            combined.put(prime,Math.max(mp1.getOrDefault(prime, 0),entry.getValue()));
        }
        for(Map.Entry<Integer,Integer> entry : combined.entrySet()){
            int prime = entry.getKey();
            lcm*=(int)Math.pow(prime,entry.getValue());
        }
        System.out.println(gcd + " " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            compute(a, b); 
        }
        sc.close();
    }
}
