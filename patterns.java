import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=n;i>=1;i--){
		    for(int j=n;j>i;j--){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        System.out.print("*");
		    }
		
		    System.out.println();
		}
		   
	}
}
/////output//////
7
*******
 ******
  *****
   ****
    ***
     **
      *
