import java.util.Scanner;
public class Day85{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data: ");
        int nilai = input.nextInt();
        int[] angka = new int[nilai];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Nilai ke-:" + (i + 1) + " : " + " ");
            angka[i] = input.nextInt();
        }
        int min = angka[0];
        for (int j = 0; j < angka.length; j++) {
            if (angka[j] < min) {
                min = angka[j];
            }
        }
        System.out.printf("Nilai Terendah:%d ", min);

    }
}
