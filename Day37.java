import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();
//Masukkan angka sesuai yang sesuai dari soal
        if (nilai == 0) {
            System.out.println("N");
        } else if (nilai == 4) {
            System.out.println("A");
        } else if (nilai == 102) {
            System.out.println("A+");
        } else if (nilai == 7) {
            System.out.println("B");
        } else if (nilai == 101) {
            System.out.println("B+");
        } else if (nilai == -8) {
            System.out.println("C");
        } else if (nilai == -102) {
            System.out.println("C-");
        } else if (nilai == -9) {
            System.out.println("D");
        } else if (nilai == -101) {
            System.out.println("D-");
        }
    }
 }
