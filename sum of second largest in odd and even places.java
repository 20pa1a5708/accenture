import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
		    arr[i]=input.nextInt();
		    if(i%2==0){
		        even.add(arr[i]);
		    }
		    else{
		        odd.add(arr[i]);
		    }
		    
		}
		Collections.sort(even);
		Collections.reverse(even);
		Collections.sort(odd);
		Collections.reverse(odd);
		System.out.println(even.get(1)+odd.get(1));
	
		
	}
}
