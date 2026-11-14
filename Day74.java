import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        int panjang = nama.length();
        System.out.println();
        System.out.println("Panjang String: " + panjang);

        String Besar = nama.toUpperCase();
        System.out.println();
        System.out.println("Uppercase:\nNama: " + Besar); 

System.out.println();
        String Kecil = nama.toLowerCase();
        System.out.println("Lowercase:\nNama: " + Kecil); 
    }
}
