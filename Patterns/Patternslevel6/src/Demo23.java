public class Demo23 {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    int num = 1;
    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        // not last row
        if (i != size) {
          if (j == 0 || j == i - 1) {
            System.out.print(num++);
          } else {
            System.out.print(" ");
          }
        }
        // last row
        else {
          System.out.print(num++);
        }
      }
      num = 1;
      System.out.println();
    }
  }
}