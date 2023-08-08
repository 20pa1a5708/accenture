import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int rem = n % m;
        
        if (rem < (m + 1) / 2) {
            System.out.println(n - rem);
        } else {
            System.out.println(n + (m - rem));
        }
    }
}
