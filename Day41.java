import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan suhu ruangan: ");
    int a = input.nextInt();
    System.out.print("Masukkan kelembapan ruangan: ");
    int b = input.nextInt();

    if( a >= 18 && a <= 28 && b >= 40 && b <= 60){
      System.out.println("Ruangan nyaman");
     }else if( a < 18 ||  b < 40 ){
      System.out.println("Suhu atau kelembapan terlalu kurang");
     }else if( a > 28 || b > 60){
      System.out.println("Suhu atau kelembapan terlalu tinggi");
       }
    }
}
