
public class palin {

	static boolean palindorm(String s,char a, char b,int index) {
	boolean	ispalin;
	if(s.charAt(s.length()/2)==index)	{
		return ispalin = palindorm(s,s.charAt(index),s.charAt(s.length()-index),index+1);
	}else {
		if(a==b) {
			ispalin = palindorm(s,s.charAt(index),s.charAt(s.length()-index),index+1);
	}else {
		ispalin =false;
		}
	}
		
	return false;
	
		
		
	}
	public static void main(String[] args) {
	
	System.out.println(palindorm("boob", 'b', 'b', 0));
	}
}
