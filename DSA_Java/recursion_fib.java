/*
class Fib {

  int fi(int i) {

    if(i <= 1) return i;
    return fi(i-1) + fi(i-2);
  
  }

  public static void main(String args[]) {
    Fib k = new Fib();
    int n = 5;
    System.out.println(k.fi(n));

  }


}
*/ 

class Fib {

    int fi(int i) {
        if(i <= 1) return i;
        int result = fi(i-1) + fi(i-2);
        return result;
    }

    public static void main(String args[]) {
        Fib k = new Fib();
        int n = 5;
        
        System.out.println(k.fi(n));
        
    }
}
