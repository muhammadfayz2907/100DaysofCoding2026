import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

       int angka,angka2;
       int menu;
       System.out.print("Masukkan angka 1: ");
       angka = input.nextInt();
       System.out.print("Masukkan angka 2: ");
       angka2 = input.nextInt();
       
       do {
            System.out.println("Daftar menu: \n1. penjumlahan \n2. perkalian \n3. pengurangan \n4. berhenti ");
            System.out.print("pilihan : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Hasil penjumlahan = " + (angka + angka2));
                    break;
                case 2:
                    System.out.println("Hasil perkalian = " + (angka * angka2));
                    break;
                case 3:
                    System.out.println("Hasil pengurangan = "+ (angka - angka2));
                    break;
                case 4:
                     System.out.println("Tidak ada Operasi, Program Berakhir");
                    break;
            }

        } while ( menu != 4);

    }
    
}
