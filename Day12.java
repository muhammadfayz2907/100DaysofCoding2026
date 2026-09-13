import java.util.Scanner;

public class Day12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String Nama = input.nextLine();
        int Umur = input.nextInt();
        double tinggibadan = input.nextDouble();
        char jeniskelamin = input.next().charAt(0);

        System.out.println("\n=== BIODATA ===");
        
        System.out.printf("Nama\t\t: %s%n ", Nama);
        System.out.printf("Umur\t\t: %d tahun%n", Umur);
        System.out.printf("Tinggi\t\t:%.2f cm%n ", tinggibadan);
        System.out.printf("Jenis Kelamin\t:%c%n ", jeniskelamin);

        System.out.println("\n=== BIODATA ===");

    }
    
}
