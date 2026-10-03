public class Day32 {
    public static void main(String[] args) {
    
    int A = 67;
      
    // Mengkombinasikan operator perbandingan dan logika

    //hasilnya false
    System.out.println(A <= 45 || 11 >= A && A == 7);     
    
    //hasilnya true
    System.out.println(A < 11 || A >= 67);                  

    //hasi awalnya false tapi setelah di tambah (!) hasilnya jadi true
    System.out.println(!(A <= 45 || 11 >= A && A == 7));    
    
     //hasilnya true
    System.out.println(A == 26 && A > 20 );              

    }
}
