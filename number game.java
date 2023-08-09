import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    int count=0;
	    while(n!=0){
	        if(n%2==0){
	            n=n/2;
	            count=count+1;
	        }
	        else{
	            n=n-1;
	            count=count+1;
	        }
	    }
	    System.out.println(count);
}
}
