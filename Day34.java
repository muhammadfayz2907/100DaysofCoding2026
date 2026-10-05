import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("DAFTAR REGU CLOVER YANG MENERIMA ANDA\n1.Fajar Emas\n2.Banteng Hitam\n3.Rajawali Perak\n4.Mawar Biru\n5.Singa Merah Tua");
      int kepilih;
      String regu = null;
      System.out.print("Pilih lah regu yang akan anda terima (Harus berupa angka): ");
      kepilih = in.nextInt();

      if (kepilih == 1){
        regu = "Fajar Emas";
      }else if(kepilih == 2){
        regu = "Banteng Hitam";
      }else if (kepilih == 3){
        regu = "Rajawali Perak";
      }else if (kepilih == 4){
        regu = "Mawar Biru";
      }else if (kepilih == 5){
        regu = "Singa Merah Tua";
      }
      if (regu == null){
        System.out.println("Tidak memilih dari salah satu regu");
      }else {
        System.out.println("SELAMAT ANDA TELAH MASUK KE REGU");
        System.out.println(regu);
        System.out.println("TATAKAE");
      }
    }
}
