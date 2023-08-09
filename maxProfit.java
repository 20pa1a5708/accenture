import java.util.*;
public class Main
{
    public int maxProfit(int a[],int n){
        if(n==0)
        return -1;
        if(n<2)
        return 0;
        int buy1=a[0];
        int buy2=a[0];
        int sell1=a[0];
        int sell2=a[0];
        for(int i=0;i<n;i++){
             buy1=Math.min(buy1,a[i]);
             sell1=Math.max(sell1,a[i]-buy1);
             buy2=Math.min(buy2,a[i]-sell1);
             sell2=Math.max(sell2,a[i]-buy2);
        }
        return sell2;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=input.nextInt();
		}
		
		System.out.println(maxProfit(a,n));
	}
}
