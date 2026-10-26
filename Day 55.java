

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = input.nextInt();

        System.out.println("\nCONTINUE");
        Continue(a);

        System.out.println("\nBREAK");
        Break(a);

        System.out.println("\nRETURN");
        Return(a);

        System.out.println("Program Selesai");
        input.close();
    }

    static void Continue(int a) {
        for (int b = 1; b <= a; b++) {
            if (b == 2) {
                continue;
            }
            if (b == 4){
              continue;
            }
            if (b == 6){
              continue;
            }
            
            System.out.print(b + " ");
        }
    }

    static void Break(int a) {
        for (int b = 1; b <= a; b++) {
            if (b == 10) {
                break;
            }
            System.out.print(b + " ");
        }
    }

    static void Return(int a) {
        for (int b = 1; b <= 5; b++) {
            if (b == 6) {
                return;
            }
            System.out.print(b + " ");
            System.out.println();
        }
        System.out.println("Tidak dapat di lanjutkan.");
    }
}
