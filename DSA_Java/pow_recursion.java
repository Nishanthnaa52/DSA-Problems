
public class Main
{   
    // time complexity - O(n)
    // Space complexity - O(1)
    private static double pow(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        
        return result;
    }
    
    // time complexity - O(nlog)
    // Space complexity - O(nlog)
    private static double exponectionalPow(double x, int n) {
        
        if (n == 0) return 1;
        
        double half = exponectionalPow(x,n/2);
        
        if (n%2 == 0) {
            return half * half;
        }
        else {
            return half * half * x;
        }
        
    }
    
	public static void main(String[] args) {
		
		double x = 2.0000;
		int n = 10;
		
		System.out.println(pow(x,n));
		System.out.println(exponectionalPow(x,n));
        
        
		
	}
}
