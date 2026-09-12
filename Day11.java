import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Hari ini adalah awal saya masuk sekolah");
    System.out.println("Guru menyuruh saya mengisi biodata");
    System.out.println("Jadi, minta tolongka isi biodatanya");

    System.out.println();
    System.out.println("======= BIODATA ======");
    System.out.print("Masukkan nama: ");
    String nama = input.nextLine();
    
    System.out.print("Masukkan alamat: ");
    String alamat = input.nextLine();

    System.out.print("Masukkan umur: ");
    int umur = input.nextInt();

    System.out.print("Masukkan tinggi badan: ");
    double tinggi = input.nextDouble();

    System.out.print("Masukkan jenis kelamin: ");
    char jeniskelamin = input.next().charAt(0);
     System.out.println("======= BIODATA ======");

  
    System.out.println();
    System.out.println("====== BIODATA ======");

    System.out.printf("Nama\t: %s%n", nama);
    System.out.printf("Alamat\t: %s%n", alamat);
    System.out.printf("Umur\t: %d tahun%n", umur);
    System.out.printf("Tinggi\t: %.1f cm%n", tinggi);
    System.out.printf("Jenis Kelamin: %c%n", jeniskelamin);
    

    System.out.println("====== BIODATA ======");
    System.out.println();

    System.out.println("Terima kasih atas isi biodatanya : " + nama);

    }
}
