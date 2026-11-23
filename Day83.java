
import java.util.Scanner;

public class Day82{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        int jmlh = in.nextInt();
        int[] jmlahbrg = new int[jmlh];
        int sum = 0;

        for (int i = 0; i < jmlahbrg.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": Rp.");
            jmlahbrg[i] = in.nextInt();
            sum += jmlahbrg[i];

        }
        System.out.printf("Total Belanja: Rp.%d", sum);

    }
}
