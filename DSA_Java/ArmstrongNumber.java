import java.util.*;
class Arm {

  int CalArm(int num) {
    int ans = 0, val = 0;
    while (num > 0) {
      val = num % 10;
      ans = ans + (val*val*val);
      num = num / 10;
    }
    return ans;
  }

  void Check(int num) {

    if (num == CalArm(num)) {
      System.out.println("Yes, Armstrong Number");
    }
    else 
      System.out.println("No, Armstrong Number");

  }

  public static void main(String args[]) {
    Arm s = new Arm();
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println(s.CalArm(num));
    s.Check(num);
  }

}
