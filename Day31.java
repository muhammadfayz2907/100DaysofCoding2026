public class Day31 {
    public static void main(String[] args) {
  
    
    int A = 20;  
    int B = 10;  
    int C = 7;  
    boolean D = true;
    boolean F = false;

    // Penggunaan && (And) Dan
    System.out.println(A <= C && A >= B);       // hasilnya false
    System.out.println(C <= B && B <= 11);      // hasilnya true
    
    // Penggunaan || (Or) Atau
    System.out.println(B <= C || A >= B);       // hasilnya true
    System.out.println(C >= B || A <= 10);      // hasilnya false

    //penggunaan ! (Not) Tidak
    System.out.println(!(B <= C || A >= B));    // hasilnya menjadi false
    System.out.println(!(C >= B || A <= 10));   // hasilnya menjadi true
  
    System.out.println(!D); // hasilnya menjadi false
    System.out.println(!F); // hasilnya menjadi true



  }      
    }
