import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka pertama: ");
    int a = input.nextInt();
    System.out.print("Masukkan angka kedua: ");
    int b = input.nextInt();
    System.out.print("Masukkan operator(+,-,*,/,%): ");
    char c = input.next().charAt(0);
    
    switch(c) {
        case '+':
            System.out.print("Hasil: "+(a + b));
            break;
        case '-':
            System.out.print("Hasil: "+(a - b));
            break;
        case '*':
            System.out.print("Hasil: "+(a * b));
            break;
        case '/':
         if (b == 0) {
                System.out.println("pembagian tidak boleh nol");
            } else {
                System.out.println("Hasil:" + (a / b));
            }
            break;
        case '%':

            if (b == 0) {
                System.out.println("pembagian tidak boleh nol");
            } else {
                System.out.println("hasil:" + (a % b));
            }
            break;
            default:
            System.out.println("Operator nya tidak sesuai:P");

    }
    }
}
