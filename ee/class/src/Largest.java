
public class Largest {

	static int largest(int[] arg,int larg, int index) {
		int large;
		
		if(index == arg.length) {
			large = larg;
		}else {
			if(arg[index]>larg) {
				large = largest(arg, arg[index], index+1);
		}else {
			large = largest(arg, larg, index+1);	
		}
		}
		
		return large;
		
	}
	public static void main(String[] args) {

		int b [] = {2,5,7,4,45,99,885,56,75,82,55};
		
		System.out.println(largest(b, 0, 0));
		
		
		
	}

}
