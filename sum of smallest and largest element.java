import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        if(arr[i]<small){
            small=arr[i];
        }
        if(arr[i]>large){
            large=arr[i];
        }
    }
    System.out.println(small+large);
}
}
