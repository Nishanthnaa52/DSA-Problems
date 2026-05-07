
class Num {

  int ReverseNum (int num) {
    int ans = 0;
    int val = 0;
    while (num > 0) {
    
      val = num % 10;
      ans = (ans * 10) + val;
      num = num / 10;
      
    }
    return ans;

  }

  public static void main(String args[]) {
   
    Num s = new Num();
    int num = -6789;
    System.out.println(s.ReverseNum(num));

  }

}
