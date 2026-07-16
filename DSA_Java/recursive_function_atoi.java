
public class Main
{
    private static int atoi(String s) {
            
        if (s.length() == 0) {
            return 0;
        }
               
         int num = atoi(s.substring(0, s.length() - 1));
     
        int lastDigigt = s.charAt(s.length() - 1) - '0';
    
        return num * 10 + lastDigigt;    

        
    }
    
	public static void main(String[] args) {
		String s = "863928";
		
		System.out.println(atoi(s));
	}
}
