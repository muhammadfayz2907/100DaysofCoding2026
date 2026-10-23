import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int pw;
      boolean benar = false;
      System.out.printf("=== WIFI ===\n1.Informatika\n2.Arsitektur\n3.PWK\nWIFI Mana yang anda mau pakai: ");
      int a = input.nextInt();

      switch(a){
        case 1:
        while(!benar){
          System.out.println("Masukkan Password: ");
          pw = input.nextInt();
          if(pw == 12345){
            benar = true;
            System.out.println("Selamat anda memakai Wifi Informatika");
          }else{
            System.out.println("Password anda salah");
          }
        }
        break;
        case 2:
        while(!benar){
          System.out.println("Masukkan Password: ");
          pw = input.nextInt();
          if(pw == 12345){
            benar = true;
            System.out.println("Selamat anda memakai Wifi Arsitektur");
          }else{
            System.out.println("Password anda salah");
          }
      }
      break;
        case 3:
        while(!benar){
          System.out.println("Masukkan Password: ");
          pw = input.nextInt();
          if(pw == 12345){
            benar = true;
            System.out.println("Selamat anda memakai Wifi PWK");
          }else{
            System.out.println("Password anda salah");
          }
          
      }
      break;
      default:
          System.out.println("Tidak ada wifi yang di temui");
          System.out.println("Mohon pilih Kembali");
          break;
      }
      }
    }
