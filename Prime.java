import java.util.Scanner;


public class Prime {
		
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
	public static void main(String[] args){
		System.out.println(isPrime(100));
		System.out.println(findDoublette(10));

	}
	public static boolean isPrime(int num){
	    for(int i=2;i<num;i++){
	    	if(num%i==0){
	    		return false;
	    	}
	    }
		return true;
	}	
	public static int findDoublette(int num){
	    for(int i=num;i<Integer.MAX_VALUE;i++){
	    	if(isPrime(i)){
	    		if(isPrime(i+2)){
	    			return i;
	    		}
	    	}
	    }
	    return 0;		
	}
}
