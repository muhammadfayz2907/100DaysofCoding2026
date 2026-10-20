import java.util.Scanner;
public class App {
     public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int nilai = input.nextInt();
String status = (nilai >= 50) ? "Lulus" : "Gagal";
System.out.println(status);

  }
}
