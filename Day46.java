import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int pilihan;
        System.out.println("=== Menu MBG ===");
        System.out.println("1. Nasi Ayam \n2. Nasi goreng \n3. Nasi Ayam penyet  \n4. Nasi Uduk \n5. Nasi goreng merah");
        System.out.println("=========================");
        System.out.print("Pilih Menu Anda   : ");
        pilihan = in.nextInt();
        System.out.println("=========================");
        switch (pilihan) {
            case 1:
                System.out.println("Menu MBG di pilih :");
                System.out.println("Nasi Ayam");
                System.out.println("=========================");
                break;
            case 2:
                System.out.println("Menu MBG di pilih :");
                System.out.println("Nasi goreng");
                System.out.println("=========================");
                break;
            case 3:
                System.out.println("Menu MBG di pilih :");
                System.out.println("Nasi Ayam penyet");
                System.out.println("=========================");
                break;
            case 4:
                System.out.println("Menu MBG di pilih :");
                System.out.println("Nasi Uduk");
                System.out.println("=========================");
                break;
            case 5:
                System.out.println("Menu MBG di pilih :");
                System.out.println("Nasi goreng merah");
                System.out.println("=========================");
                break;

            default:
                System.out.println("Tidak ada di dalam menu");
                System.out.println("Mohon pilih Kembali");
                break;
        }
    }
    
}
