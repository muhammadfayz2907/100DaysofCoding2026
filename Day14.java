import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    int penjumlahan = a + b;
    int pengurangan = a - b;

    System.out.println("Hasil penjumlahan:" + penjumlahan);
    System.out.println("Hasil pengurangan:" + pengurangan);

    }
}
