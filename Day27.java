import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("A: ");
      int A = input.nextInt();

      System.out.print("B: ");
      int B = input.nextInt();

      System.out.println(A++);
      System.out.println(++A);
      System.out.println(A--);
      System.out.println(--A);

      System.out.println(B++);
      System.out.println(++B);
      System.out.println(B--);
      System.out.println(--B);


    }
}
