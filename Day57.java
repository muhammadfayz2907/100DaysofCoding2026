import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); 
        
        for (int i = 1; i <= a; i++) {

            if (i%2!=0)
            System.out.print(i+ " ");

        }

        System.out.println();
        for (int i = 1; i <= a; i++) {

            if (i%2==0)
            System.out.print(i+ " ");

        }
    }
}
