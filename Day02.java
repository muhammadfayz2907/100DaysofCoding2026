public class App {
    public static void main(String[] args) throws Exception {
        // How to make biodata diri menggunakan, use, memakai print, println dan printf

        String nama = "MuhammadFaiz";
        String status = "MahaSiswa";
        String rank = "MentokGlory";
        String statuss = "Jomblohappy";
        int umur = 19;
        double tinggi = 166;

        // 1. First atau pertama tama nih prtintln awalan buat baris baru 
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Rank : " + rank);
        System.out.println("Statuss : " + statuss);

        // 2. Second atau dua atau two print untuk ndak ada lagi baris baru
        System.out.print("Umur : " + umur);

        // 3. Third atau ketiga terakhir jga bisa printf untuk mencetak format khusus 
        System.out.printf("%nTinggi : %.of cm%n" + tinggi);


    }
}
