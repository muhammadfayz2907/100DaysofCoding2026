import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Masukkan nilai A\t:");
        int A = input.nextInt(); 
      //nilai semisalnya 5

      System.out.print("Masukkan nilai B\t:");
        int B = input.nextInt(); 
      //nilai semisalnya 5

      System.out.print("Masukkan nilai C\t:");
        int C = input.nextInt();   
      //nilai semisalnya 10

        System.out.println(A == B);   
      // hasil nya true
        System.out.println(B == C);     
      // hasil nya false
        System.out.println(A != B);     
      // hasil nya false
        System.out.println(C != A);     
      // hasil nya true

      
      
    }
}
