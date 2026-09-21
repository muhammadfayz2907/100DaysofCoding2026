import java.util.Scanner;

public class Day20 {
    
    public static void main(String[] args) {
        
        Scanner rimuru = new Scanner(System.in);
        
        System.out.println("=== MASUKKAN DATA ===");
        
        System.out.print("NIM               :");
        int nim = rimuru.nextInt();
        
        System.out.print("Umur              :");
        int umur = rimuru.nextInt();
        
        System.out.print("Tinggi badan      :");
        double tinggibadan = rimuru.nextDouble();
        
        
        String nimString  = String.valueOf(nim);
        String umurString = Integer.toString(umur);
        String tinggibadanString   = tinggibadan + "";
        
        String penggabungan = umurString + tinggibadanString;
        
        System.out.println("=== DATA MAHASISWA ===");

        System.out.println("NIM                     : " + nimString);
        System.out.println("Umur                    : " + umurString + " tahun");
        System.out.println("Tinggi Badan            : " + tinggibadanString + " cm");
        System.out.println("Gabungan umur dan tb    : " + penggabungan);

        System.out.println("=== DATA MAHASISWA ===");
        
        
    }
    
}
