import java.util.Scanner;
public class Day86 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int a = input.nextInt();
        input.nextLine();
        String[] mhs = new String[a];

        for (int i = 0; i < mhs.length; i++) {
            System.out.print("Masukkan Nama ke-" + (i + 1) + ":" + " ");
            mhs[i] = input.nextLine();
        }
        System.out.print("Masukkan nama yang dicari: ");
        String mhstmpungan = input.nextLine();

        boolean ditemukan = false;
        for (int j = 0; j < mhs.length; j++) {
            if (mhs[j].equalsIgnoreCase(mhstmpungan)) {
                System.out.println("Nama " + mhs[j] + " ditemukan.");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Nama " + mhstmpungan + " Tidak Ditemukan");
        }
    }
}
