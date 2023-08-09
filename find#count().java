import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }
        
        int num = input.nextInt();
        int diff = input.nextInt();
        
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (Math.abs(num - arr.get(i)) <= diff) {
                count++;
            }
        }
    
        System.out.println(count);
    }
}
