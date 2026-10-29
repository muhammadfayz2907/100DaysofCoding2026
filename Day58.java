import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
System.out.println("Angka ganjil: ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
              
                System.out.print(i + " ");
            }
        }

        System.out.println();
System.out.println("Angka genap: ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
            
                System.out.print(i + " ");
            }
        }
    }
}
