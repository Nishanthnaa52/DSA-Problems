import java.util.*;

class digit {
  
  int num(int a) {
    int count = 0;
    
    while (a > 0) { 
      a = a / 10;
      count++;
    }

    return count;
  }

  int AdvNum(int a) {
    int count = 0;
  
    count = (int)(Math.log10(a) + 1);
    return count;
  }

  public static void main(String args[]) {

    digit a = new digit();
    Scanner input = new Scanner(System.in);

    int val;
    System.out.print("Enter a value : ");
    val = input.nextInt();

    System.out.println(a.AdvNum(val));

  }

}
