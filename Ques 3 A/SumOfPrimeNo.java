

public class SumOfPrimeNo {

	
	  public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	        int count = 0; 
	        long sum = 0;  
	        int num = 2;   

	        while (count < 5) {
	            if (isPrime(num)) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }
	        System.out.println("The sum of the first 5 prime numbers is: " + sum);
	    }

	   
	  
}
