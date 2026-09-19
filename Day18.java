
public class Day18 {
    public static void main(String[] args) {
      //mengubah otomatis dari tipe data kecil ke besar
      byte nominalbyte = 67;
      //tipe data byte ke short
      short nominalshort = nominalbyte;
      //tipe data short ke int
      int nominalint = nominalshort;
      //tipe data int ke long
      long nominallong = nominalint;
      //tipe data long ke float
      float nominalfloat = nominallong;
      //tipe data float ke double
      double nominaldouble = nominalfloat;

      System.out.println("==================================");
      System.out.println("Nilai byte\t\t:" + nominalbyte);
      System.out.println("Nilai short\t\t:" + nominalshort);
      System.out.println("Nilai int\t\t:" + nominalint);
      System.out.println("Nilai long\t\t:" + nominallong);
      System.out.println("Nilai float\t\t:" + nominalfloat);
      System.out.println("Nilai double\t:" + nominaldouble);
      System.out.println("==================================");
    }
}
