import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		    arr[i]=input.nextInt();
		if(arr[i]>max){
		    max=arr[i];
		}
		else{
		    continue;
		}
		}
		System.out.println(max);
		System.out.println(arr.indexOf(max));
	}
}
