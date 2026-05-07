/*
class Rec {
  int c = 0;
  void count() {
    if (c == 4){
      return;
    }
    System.out.println(c);
    c++;
    count();
  }

  public static void main(String args[]) {

    Rec n = new Rec();
    System.out.println("Recursion function program...");
    n.count();

  }

}
*/

class RecNam {

  void p(int i, String name) {
    if (i > 0)  {
      System.out.println(name);
      p(i-1, name);
    }
    else {
      return;
    }
    
  }

  public static void main(String args[]) {
    RecNam n = new RecNam();
    System.out.println("Print a name N time's");
    String name = "Nishanth";
    n.p(5,name);
  }

}



