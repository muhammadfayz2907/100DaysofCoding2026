import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      System.out.println("Selamat Datang di bazar");
      System.out.println("Di sini kami menjual makanan dan minuman");
      System.out.println("=========== MENU MAKANAN ===========");
      System.out.println("MAKANAN                    HARGA");
      System.out.println("1.Bakso\t\t\t\t\t Rp.10.000\n2.Mie Bakso\t\t\t\t Rp.15.000\n3.Telur Gulung\t\t\t Rp.5.000\n4.Dimsum\t\t\t\t Rp.20.000");
      System.out.println("");
      System.out.println("=========== MENU MINUMAN ===========");
      System.out.println("MINUMAN                    HARGA");
      System.out.println("5.Matcha\t\t\t\t Rp.15.000\n6.Pop Ice\t\t\t\t Rp.5.000");
      System.out.println("");
      System.out.print("Masukkan angka sesuai Menu nya:");
      int a = input.nextInt();
      System.out.println("");
      int hrga = 0;
      int total = 0;
      String c = null;

      if(a == 1) {
       c = "Bakso";
       hrga = 10000;
      } else if(a == 2) {
       c = "Mie Bakso";
       hrga = 15000;
      } else if(a == 3) {
       c = "Telur Gulung";
       hrga = 5000;
      } else if(a == 4) {
       c = "Dimsum";
       hrga = 20000;
      } else if(a == 5) {
       c = "Matcha";
       hrga = 15000;
      } else if(a == 6) {
       c = "Pop Ice";
       hrga = 5000;
      } 
      if(c == null){
        System.out.println("MOHON PESANAN ANDA BELUM ADA");
      } else{
      System.out.print("Masukkan uang anda:");
      int b = input.nextInt();
      total = b - hrga;

      System.out.println("===== PESANAN ANDA =====");
      System.out.println("MENU            HARGA");
      System.out.println(c + "\t\tRp."+ hrga );
      System.out.println("");
      System.out.println("Uang anda:\t\tRp." + b);
      System.out.println("===== KEMBALIAN =====");
      System.out.println("Uang Rp."+total);
      }
    }
}
