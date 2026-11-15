public class Day75 {
    public static void main(String[] args) {

        String teks1 = "Jawa adalah kunci";
        String teks2 = "jawa adalah kunci";
        String tekskosong = "";

        // 1. equals() (kedua nya harus sama)
        boolean hasil = teks1.equals(teks2);
        System.out.println("equals(): " + hasil);

        // 2. equalsIgnoreCase() tidak masalah besar atau kecilnya 
        boolean hasil2 = teks1.equalsIgnoreCase(teks2);
        System.out.println("equalsIgnoreCase(): " + hasil2);

        // 3. contains() mengecek apakah ada kata yang kita cari dari string tersebut
        boolean hasil3 = teks1.contains("Jawa");
        System.out.println("contains(): " + hasil3); // true

        // 4. isEmpty() nah cek i stringnya kosong atau tidak
        boolean hasil4 = tekskosong.isEmpty();
        System.out.println("isEmpty(): " + hasil4);
    }
}
