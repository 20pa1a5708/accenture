import java.util.*;
public class Main
{
    public static boolean argument(int n,int num1,int num2){
        if(n%num1==0&&n%num2==0){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num1=input.nextInt();
		int num2=input.nextInt();
		boolean result=argument(n,num1,num2);
		System.out.println(result);
	}
}
