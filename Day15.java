import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      //Rimuru ingin membeli buku bersama teman nya
      
      int buku = input.nextInt();
      int jumlah = input.nextInt();
      int org = input.nextInt();
      

      int totalharga = buku * jumlah;
      int biayaperorang = totalharga / org;

      System.out.println("Jumlah buku\t\t:" + buku);
      System.out.println("Harga Buku\t\t:Rp." + jumlah);
      System.out.println("Total Harga\t\t:Rp." + totalharga);
      System.out.println("Biaya Per orang\t:Rp." + biayaperorang);
      
      System.out.println();
      System.out.println("Terima kasih sudah membantu rimuru");


    }
}
