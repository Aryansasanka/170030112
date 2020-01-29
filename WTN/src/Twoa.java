
public class Twoa {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if(args.length==0){
			System.out.println("Please enter an integer number ");
		}
		else if(a>0){
			System.out.println(a+" is a positive number");
		}
		else if(a<0){
			System.out.println(a+" is a negative number");
		}
		else if(a==0){
			System.out.println(a+" is neither negative or positive");
		}
		else{
			System.out.println("An integer number as argument is expected");
		}
	}
}
