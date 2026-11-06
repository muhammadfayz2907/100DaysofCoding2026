import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int b = 0; b < a / 2; b++) {
            for(int c = 0; c < a; c++ ){
                if((b + c) % 2 == 0){
                    System.out.print(" 0 ");
                }else{
                    System.out.print(" # ");
                }
                if(c < a -1){
                    System.out.print(" ");
                }
        }
         System.out.println(); 
            }
        }
            
        }
