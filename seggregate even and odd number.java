import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        ArrayList<Integer> al = new ArrayList<Integer>();
           for (int i = 0; i < n; i++) {
            al.add(input.nextInt());
        }
        
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                even.add(al.get(i));
            } else {
                odd.add(al.get(i));
            }
        }
        
        even.addAll(odd);
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i) + " ");
        }
    }
}
