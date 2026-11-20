import java.util.Scanner;
public class Day80{
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

       String[] buah = {"Apel", "Jeruk", "Semangka", "Pepaya"};
         System.out.print("Ada beberapa buah\n1.Apel\n2.Jeruk\n3.Semangka\n4.Pepaya\n");
         int opsi = input.nextInt();
         switch(opsi){
             case 1:
                 System.out.println(buah[0]);
             break;
             case 2:
                 System.out.println(buah[1]);
                 break;
             case 3:
            System.out.println(buah[2]);     break;
             case 4:
                 System.out.println(buah[3]);
                 break;
             default:
                 System.out.println("Tidak ada di dalam opsi");
                 
         }
        
    }
}
