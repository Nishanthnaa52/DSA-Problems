
class Back {
  //eint s = 0;
  void num(int s ,int n) {

    if (n > 0) {
      num(s+n,n-1);
      System.out.println(n);
    }
    else
      System.out.println(s);
      return;

  } 
  
  int sum(int n) {

    if (n == 0) return 0;
    else {
      return n + sum(n-1);
    }
  }

  public static void main(String args[]) {

    Back b = new Back();
    
    System.out.println(b.sum(5));

  }


}
