import java.util.*;
class RevArr {

  void rev(int i, Integer[] arr, int n) {

    if (i >= n/2) return;
    else {
    Collections.swap(Arrays.asList(arr), i, n-i-1);
    rev(i+1, arr, n);
    }

  }

  public static void main(String args[]) {
    RevArr r = new RevArr();
    Integer[] arr = {1,2,3,4,5};
    System.out.println("Before swap : \n" + Arrays.toString(arr));
    r.rev(0, arr, 5);
    /*
    for (int n : arr) {
      System.out.println(n);
    }*/ 
    System.out.println("After swap : \n" + Arrays.toString(arr));
  }

}
