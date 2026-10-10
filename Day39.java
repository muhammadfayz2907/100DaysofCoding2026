import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    char c = in.next().charAt(0);
    

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
