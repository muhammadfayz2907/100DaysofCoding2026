import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Masukkan Angka: ");
      int angka = input.nextInt();

      String status = (angka % 2 == 0) ? "Genap" : "Ganjil";

      System.out.printf("Angka %d adalah bilangan %s",angka,status);
        
      
    }
}
