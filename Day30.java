public class Day30 {
    public static void main(String[] args) {
      System.out.println("3 mahasiswa ingin memperbandingkan uang koin mereka");
      System.out.println("Joko : 10 Coin \nBudi : 10 Coin \nWowo : 5 Coin");
      
        int J = 10;
        int B = 10;
        int W = 5;
       

        System.out.println(J <= B);
      // hasilnya true
        System.out.println(J >= B);
      // hasilnya true
        System.out.println(B <= W);
      // hasilnya false
        System.out.println(B >= W); 
      // hasilnya true
        System.out.println(W <= J);
      // hasilnya true
        System.out.println(W >= B);
      // hasilnya false


        

    }
}
