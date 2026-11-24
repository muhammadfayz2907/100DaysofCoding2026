import java.util.Scanner;
public class Day84 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Data: ");
        int data = input.nextInt();
        int[] jumlah = new int[data];

        for (int i = 0; i < jumlah.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + ": ");
            jumlah[i] = input.nextInt();

        }
        int bsr = jumlah[0];
        for (int j = 0; j < jumlah.length; j++) {
            if (jumlah[j] > bsr) {
                bsr = jumlah[j];
            }
        }
        System.out.printf("Nilai Tertinggi:%d ", bsr);

    }
}
