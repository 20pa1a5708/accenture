import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	String str=input.next();
	int res=str.charAt(0)-'0';
	for(int i=1;i<str.length();i++){
	    char prev=str.charAt(i);
	    i++;
	    if(prev=='A'){
	        res=res & (str.charAt(i)-'0');
	    }
	    else if(prev=='B'){
	        res=res | (str.charAt(i)-'0');
	    }
	    else{
	        res=res^(str.charAt(i)-'0');
	    }
	}
	System.out.println(res);
}
}
