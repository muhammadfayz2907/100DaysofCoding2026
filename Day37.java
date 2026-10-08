import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();
        String code;
//Masukan satu angka sesuai yang sesuai dari soal
        if (nilai == 0) {
            code = "N";
        } else if (nilai > 0) {
            if (nilai % 2 == 0) {
                code = "A";
            } else { 
                code = "B";
            }
            
            if (nilai > 100) {
                code = code + "+";
            }
        }    
        else {
            if (nilai % 2 == 0) {
                code = "C";
            } else {
                code = "D";
            }
            if (nilai < -100) {
                code = code + "-";
            }
        }
        System.out.println(code);       
    }
}
