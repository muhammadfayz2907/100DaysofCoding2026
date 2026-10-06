import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

  System.out.print("Masukkan kode tiket: ");
    int kode = input.nextInt();

  System.out.print("Masukkan umur: ");  
    int umur = input.nextInt();

  System.out.print("Masukkan saldo: ");  
    int saldo = input.nextInt();

    int hasil = kode*umur%100;
    
    boolean status = false;
  
    
    if (hasil >= 20 && hasil <= 80) {
        if (umur < 17) {
          if (saldo >= 100000) {
            status = true;
          }
        } else {
            if (saldo >= 50000) {
              status = true;
              }
            }
          }
System.out.println("Nilai Pemeriksaan: " + hasil);
if (status) {
  System.out.println("Status Tiket: VALID");
} else {
  System.out.println("Status Tiket: TIDAK VALID");
  }
 }
}
