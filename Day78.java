import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI MOBILE LEGEND, SILAHKAN MEMBUAT AKUN TERLEBIH DAHULU");
        System.out.println("ADA DUA OPSI MEMBUAT AKUN:\n1.Google\n2.Facebook ");
        int opsi = input.nextInt();
        switch (opsi) {
            case 1 :
        System.out.println("=== BUAT AKUN DARI GOOGLE ===");
        System.out.println("Masukkan Username baru : ");
        String userterdaftar = input.next();

        System.out.println("Masukkan Password baru : ");
        String pwterdaftar = input.next();

        System.out.println("\nAkun berhasil dibuat! Silakan login.\n");
        System.out.println("=== LOGIN KE AKUN FACEBOOK ===");
        boolean statuslogin = false;

        while (!statuslogin) {
            System.out.print("Username : ");
            String inputuser = input.next();

            System.out.print("Password : ");
            String inputpw = input.next();

            if (inputuser.equals(userterdaftar) && inputpw.equals(pwterdaftar)) {
                System.out.println("\nLogin Berhasil! Selamat datang, " + userterdaftar + ".");
                statuslogin = true; 
            } else {
                System.out.println("Username atau password salah! Silakan coba lagi.\n");
                
            }
        }
                break;
            case 2 :
                System.out.println("=== BUAT AKUN DARI FACEBOOK ===");
        System.out.println("Masukkan Username baru : ");
        String userrterdaftar = input.next();

        System.out.println("Masukkan Password baru : ");
        String pwwterdaftar = input.next();

        System.out.println("\nAkun berhasil dibuat! Silakan login.\n");
        System.out.println("=== LOGIN KE AKUN FACEBOOK ===");
        boolean statusslogin = false;

        while (!statusslogin) {
            System.out.print("Username : ");
            String inputuserr = input.next();

            System.out.print("Password : ");
            String inputpww = input.next();

            if (inputuserr.equals(userrterdaftar) && inputpww.equals(pwwterdaftar)) {
                System.out.println("\nLogin Berhasil! Selamat datang, " + userrterdaftar + ".");
                statuslogin = true; 
            } else {
                System.out.println("Username atau password salah! Silakan coba lagi.\n");
                
            }
        }
            default:
                System.out.println("Opsi yang anda pilih tidak ada");
                break;
        }
    }
}
