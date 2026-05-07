
class fact {

  int fa(int n) {

    if (n == 0) return 1;
    else {
      return n * fa(n-1);
    }

  }

  public static void main(String args[]) {

    fact f = new fact();
    int n = 5;
    System.out.println(f.fa(n));

  }

}
