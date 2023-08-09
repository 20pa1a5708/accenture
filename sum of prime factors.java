import java.util.*;

public class Main {
  
    public static boolean isPrime(int n){
        if(n<=1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
                return true;
            }
public static int sumOfFactors(int n){
    int sum=0;
    for(int i=2;i<n;i++){
    if(n%i==0&&isPrime(i)){
        sum+=i;
    }
}
return sum;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(sumOfFactors(n));
    }
}
