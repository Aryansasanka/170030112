
public class Twoc {
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int rem,sum=0,temp;
		temp=n;
		 while(n>0){    
            rem=n%10;  
			sum=(sum*10)+rem;    
			n=n/10;    
		} 
		if(temp==sum){ 
			for(int i=0;i<args.length;i++)
			System.out.println(args[i]+" is a palindrome number ");    
		}
		else{   
		     for(int i=0;i<args.length;i++)
			System.out.println(args[i]+" is not a palindrome number"); 	
		}
	}
}
