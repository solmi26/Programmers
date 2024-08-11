import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int count = sc.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < count; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      int c = sc.nextInt();
      for (int j = a; j <= b; j++) {
        arr[j] = c;
      }
    }
    ;

    for (int a : arr) {
      System.out.print(a + " ");
    }
  }
}
