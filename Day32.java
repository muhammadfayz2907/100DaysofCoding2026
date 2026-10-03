public class Day32 {
    public static void main(String[] args) {
    
    int A = 67;
      
    // Mengkombinasikan operator perbandingan dan logika

    //hasilnya false
    System.out.println(A <= 19 || 50 >= A && A == 77);     
    
    //hasilnya true
    System.out.println(A < 100 || A >= 67);                  

    //hasi awalnya false tapi setelah di tambah (!) hasilnya jadi true
    System.out.println(!(A <= 19 || 50 >= A && A == 77));    
    
     //hasilnya true
    System.out.println(A == 20 && A > 2 );              

    }
}
