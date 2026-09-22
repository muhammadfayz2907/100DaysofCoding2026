import java.util.Scanner;
//MENGGUBAH TIPE DATA STRING KE TIPE DATA PRIMITF
public class Day21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input tipe data string
        System.out.print("Nama\t\t\t:");
        String namaString = input.nextLine();
        
        System.out.print("Umur\t\t\t:");
        String umurString = input.nextLine();
        
        System.out.print("Tinggi Badan\t\t:");
        String tbString = input.nextLine();
        
        System.out.print("Berat Badan\t\t:");
        String bbString = input.nextLine();
        
        System.out.print("Semester\t\t:");
        String semesterString = input.nextLine();
        
        System.out.print("IPK\t\t\t:");
        String ipkString = input.nextLine();
          
        System.out.print("NIM\t\t\t:");
        String nimString = input.nextLine();
        
        System.out.print("Jumlah Penghargaan\t:");
        String penghargaanString = input.nextLine();
        
        System.out.print("Kode Kelas\t\t:");
        String kelasString = input.nextLine();
        
       //tipe data string ke tipe data primitif
        
        int umur = Integer.parseInt(umurString);
        
        double tb = Double.parseDouble(tbString);
        
        double bb = Double.parseDouble(bbString);
        
        short semester = Short.parseShort(semesterString);
        
        double ipk = Double.parseDouble(ipkString);
        
        long nim = Long.parseLong(nimString);
        
        byte penghargaan = Byte.parseByte(penghargaanString);
        
        char kelas = kelasString.charAt(0);
        
        // perhitungan
        int tahun_lahir = 2026 - umur;
        int totalpoint = (penghargaan * 10) + (semester * 5);
        double tinggi_dalam_meter = tb / 100;
        
        // inisial nama 
        char inisial = namaString.charAt(0);
        
        // output
        System.out.println("\n=== DATA ANGGOTA UKM MULTIMEDIA ===");
        System.out.println("Nama\t\t\t: " + namaString + " (Inisial: " + inisial + ")");
        System.out.println("Umur\t\t\t: " + umur + " tahun, Perkiraan Lahir: " + tahun_lahir);
        System.out.println("Tinggi\t\t\t: " + tb + " cm (" + tinggi_dalam_meter + " m), Berat: " + bb + " kg");
        System.out.println("Semester\t\t: " + semester + ", IPK: " + ipk + ", NIM: " + nim);
        System.out.println("Kode Kelas\t\t: " + kelas + ", Jumlah Penghargaan: " + penghargaan);
        System.out.println("Total Poin Prestasi\t: " + totalpoint);
        
    }
    
    }
