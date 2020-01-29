
public class Twob {
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		if(a==1){
			System.out.println(a+" is neither prime nor composite");
		}
		else if(a==0){
			System.out.println(a+" is neither prime nor composite");
		}
		else{
			int c=0;
			for(int i=1;i<=a;i++){
				if(a%i==0){
					c++;
				}
			}
			if(c==2){
					System.out.println(a+" is a prime number");
				}
				else{
					System.out.println(a+" is a not prime number");
				}
		}
	}
}
