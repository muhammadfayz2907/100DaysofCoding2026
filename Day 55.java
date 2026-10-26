
public class Gabungan {

    public static int prosesAngka(int target) {

        for (int i = 1; i <= 20; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 4){
                continue;
            }

            if (i == target) {
                return i;
            }

            if (i == 19 ) {
                break;
            }

            System.out.println("Memeriksa: " + i);
        }

        return -1;
    }

    public static void Day55(String[] args) {

        int hasil = prosesAngka(10);

        if (hasil != -1) {
            System.out.println("Ditemukan: " + hasil);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
