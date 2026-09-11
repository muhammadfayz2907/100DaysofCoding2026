public class Day10 {
    public static void main(String[] args) {
        // 1 & 2. Deklarasi dan nilai awal karakter
        byte level = 1;
        short jumlah_item = 1;
        int exp = 10;
        long gold = 50;

        // 3. Batas maksimal tipe data
        System.out.println("=== BATAS MAKSIMAL TIPE DATA ===");
        System.out.println("Maks Byte : " + Byte.MAX_VALUE);
        System.out.println("Maks Short: " + Short.MAX_VALUE);
        System.out.println("Maks Int  : " + Integer.MAX_VALUE);
        System.out.println("Maks Long : " + Long.MAX_VALUE);
        System.out.println("=== BATAS MAKSIMAL TIPE DATA ===");

        System.out.println("Jefri : Saya warga desa yang bercita-cita menjadi pahlawan");
        System.out.println("Jefri : Karna pernah ka di bantu sama pahlawan,");
        System.out.println("Jefri : yang telah menyelamatkan ku");
        System.out.println("Jefri : Status buka");

        // 5. Data awal karakter
        System.out.println("=== STATUS AWAL KARAKTER ===");
        System.out.println("Nama : Jefri");
        System.out.println("Level: " + level);
        System.out.println("Item : " + jumlah_item);
        System.out.println("EXP  : " + exp);
        System.out.println("Gold : " + gold);
        System.out.println("Rank : Warrior");
        System.out.println("=== STATUS AWAL KARAKTER ===");
        
        System.out.println("Jefri : Haruska latihan, latihan dan latihan sambil ke dungeon,");
        System.out.println("Jefri : biar bisa tercapai");
        
        System.out.println("Disitulah tekad jefri sudah terbentuk");
        System.out.println("Level up!");
        System.out.println("Dia latihan, latihan dan mengeksplor dungeon");
        
        System.out.println("Level up!");
        System.out.println("Level up!");
    
        
        // 4. Update data setelah misi
        level += 89;
        jumlah_item += 99;
        exp += 25000;
        gold += 158302;
        
        System.out.println("Jefri : Akhirnya sampai ma di lantai bos terakhir");
        System.out.println("Jefri : Banyak gosip yang blg kalau mengalahkan menaikan level secara drastis");
        
        System.out.println("Sistem : Bos sudah di kalahkan");
        System.out.println("Level up!");
        System.out.println("Level up!!");
        
        System.out.println("Jefri : Finally sudah dikalahkan, waktunya liat stats");
        
        // 5. Data setelah misi
        System.out.println("=== STATUS SETELAH MISI ===");
        System.out.println("Level: " + level);
        System.out.println("Item : " + jumlah_item);
        System.out.println("EXP  : " + exp);
        System.out.println("Gold : " + gold);
        System.out.println("Rank : Pahlawan");
    }
}
