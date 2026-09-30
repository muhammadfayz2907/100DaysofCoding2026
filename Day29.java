import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.println("Di SD");
    System.out.println();
    System.out.println("Pada jam istirahat");
    System.out.println("Ada tiga murid yang lagi jajan di kantin pak asep");
    System.out.println("Wowo, Basuki, Joko");
    System.out.println("Di kantin tersebut terkenal dengan donat nya yang enak");

    System.out.print("Berapa donat wowo ingin beli \t:");
        int W = input.nextInt(); //Misal 10 donat 
    System.out.print("Berapa donat basuki ingin beli \t:");
        int B = input.nextInt(); //Misal 5 donat
    System.out.print("Berapa donat joko ingin beli \t:");
        int J = input.nextInt(); //Misal 3 donat

    //Tergantung seberapa banyak donat yang di beli 
        System.out.println(W > B);  // hasil nya true
        System.out.println(J > B);  // hasil nya false
        System.out.println(B < W);  // hasil nya true
        System.out.println(J < B);  // hasil nya true
        System.out.println(J > W);  // hasil nya false
        System.out.println(J < W);  // hasil nya false


    }
    
}
