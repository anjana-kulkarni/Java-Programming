public class Demo21 {
  public static void main(String[] args) {
    int size = 5;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }
      int num = 1;
      for (int k = 0; k < 2 * i + 1; k++) {
        if (i == 0 || i == size - 1) {
          System.out.print(num++);
        } else {
          if (k == 0 || k == 2 * i) {
            System.out.print(num++);
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}