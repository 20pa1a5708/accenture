import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    String s=input.nextLine();
	    String words[]=s.split(" ");
	    String result="";
	    for(int i=words.length-1;i>=0;i--){
	        result+=words[i]+" ";
	    }
	   
	    System.out.println(result);
}
}
