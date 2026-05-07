
class Rav {

  boolean pali(int i, String n) {

    if (i >= n.length()/2) return true;

    if (n.charAt(i) != n.charAt(n.length()-i-1)) return false;

    return pali(i+1, n);

  }


  public static void main(String args[]) {
    
    Rav k = new Rav();
  
    String s = "shivani nishanth";
    System.out.println(k.pali(0,s));
    System.out.println(s);

  }


}
