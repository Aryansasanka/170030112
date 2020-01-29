
public class Twoe {
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int rem,sum=0,temp;
		temp=n;
		 while(n>0){    
            rem=n%10;  
			sum=sum+rem;    
			n=n/10;    
		} 
		System.out.println("sum is "+sum);
		}
}
