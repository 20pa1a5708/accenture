import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=0;i<m;i++){
		    if(i%n!=0){
		         sum+=i;
		    }
		    else{
		        sum1+=i;
		    }
		}
		System.out.println(sum-sum1);
	}
}
