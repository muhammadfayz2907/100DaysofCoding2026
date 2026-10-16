import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("SELAMAT DATANG DI WARUNG MADURA");
      System.out.println("====== LIST MAKANAN ======\n1.AYAM GEPREK\n2.AYAM BAKAR\n3.GADO GADO\n4.LELE\n5.MIE GORENG");
      System.out.println("Silahkan di pilih: ");
      int a = input.nextInt();
      int tambah = 0;
      int hasil = 0;

      switch(a){
        case 1:
        System.out.println("Harganya: 15k, mau berapa?");
        int b = input.nextInt();
        int c = b * 15000;
        System.out.println("Semuanya: Rp."+c );
        System.out.print("Silahkan bayar: Rp." );
        int d = input.nextInt();
        int e = c - d;
        if(c > d){
          System.out.println("Uang anda tidak cukup, mohon di tambah sebesar: Rp."+ e);
          tambah = input.nextInt();
          hasil = tambah - e;
        }
        System.out.println("Kembalian nya: Rp."+hasil);
        break;
        case 2:
        System.out.println("Harga nya: 10k, mau berapa?");
        int f = input.nextInt();
        int g = f * 10000;
        System.out.println("Semuanya: Rp."+g );
        System.out.print("Silahkan bayar: Rp.");
        int h = input.nextInt();
        int i = g - h;
        if(g > h){
          System.out.println("Uang anda tidak cukup, mohon di tambah sebesar: Rp."+ i);
          tambah = input.nextInt();
          hasil = tambah - i;
        }
        System.out.println("Kembalian nya: Rp."+hasil);
        break;
        case 3:
        System.out.println("Harganya: 15k, mau berapa?");
        int j = input.nextInt();
        int k = j * 15000;
        System.out.println("Semuanya: Rp."+k);
        System.out.print("Silahkan bayar: Rp.");
        int l = input.nextInt();
        int m = k - l;
        if(k > l){
          System.out.println("Uang anda tidak cukup, mohon di tambah sebesar: Rp."+ m);
          tambah = input.nextInt();
          hasil = tambah - m;
        }
        System.out.println("Kembalian nya: Rp."+hasil);
        break;
        case 4:
        System.out.println("Harganya: 9k, mau berapa?");
        int n = input.nextInt();
        int o = n * 9000;
        System.out.println("Semuanya: Rp."+o);
        System.out.print("Silahkan bayar: Rp.");
        int p = input.nextInt();
        int q = o - p;
        if(o > p){
          System.out.println("Uang anda tidak cukup, mohon di tambah sebesar: Rp."+ q);
          tambah = input.nextInt();
          hasil = tambah - q;
        }
        System.out.println("Kembalian nya: Rp."+hasil);
        break;
        case 5:
        System.out.println("Harganya: 5k, mau berapa?");
        int r = input.nextInt();
        int s = r * 5000;
        System.out.println("Semuanya: Rp."+s);
        System.out.println("Silahkan bayar: Rp.");
        int t = input.nextInt();
        int u = s - t;
        if(s > t){
          System.out.println("Uang anda tidak cukup, mohon di tambah sebesar: Rp."+ u);
          tambah = input.nextInt();
          hasil = tambah - u;
        }
        System.out.println("Kembalian nya: Rp."+hasil);
        default:
        System.out.println();
        System.out.println("Pilih opsi nya 1 - 5 wok");
      }

    }
}
