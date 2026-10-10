import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    char c = input.next().charAt(0);
    

if (c == 'A') {
  System.out.println(a+b);
}if (c == 'B') {
  System.out.println(a-b);
}if (c == 'C') {
  System.out.println(a*b);
}if (c == 'D') {
  System.out.println(a/b);
} 


 }
}
