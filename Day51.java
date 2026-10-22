import java.util.Scanner;
public Day51 App {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Tinggi Segitiga: ");
    int a = input.nextInt();
    
    for (int baris = 1; baris <= a; baris++) {
    for (int kolom = 1; kolom <= baris; kolom++) {
        System.out.print(kolom + " ");
    }
        System.out.println();
   }
 }
}
