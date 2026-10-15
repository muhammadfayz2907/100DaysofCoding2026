import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Beberapa siswa kelas 12 ingin melihat hasil dari ujian nya");
String predikat = null;
System.out.print("Masukkan nama\t\t: ");
String nama = input.nextLine();
System.out.print("Masukkan kelas nya\t: ");
char kelas = input.next().charAt(0);
System.out.print("Masukkan Nilai Ujian: ");
int nilai = input.nextInt();

switch(kelas) {
  case 'A':
if (nilai>=90 && nilai<=100) {
    predikat = "A";
    
} else if (nilai>=80 && nilai<=89){
    predikat = "B";
    
} else if (nilai>=70 && nilai<=79){
    predikat = "C";
    
} else if (nilai>=60 && nilai<=69){
    predikat = "D";
    
} else if (nilai>=0 && nilai<=59){
    predikat = "E";
    
} else {
    System.out.println("Nilai Tidak Valid");
}
  break;
  case 'B':
  if (nilai>=90 && nilai<=100) {
    predikat = "A";
    
} else if (nilai>=80 && nilai<=89){
    predikat = "B";
    
} else if (nilai>=70 && nilai<=79){
    predikat = "C";
    
} else if (nilai>=60 && nilai<=69){
    predikat = "D";
    
} else if (nilai>=0 && nilai<=59){
    predikat = "E";
    
} else {
    System.out.println("Nilai Tidak Valid");
}
  break;
  case 'C':
  if (nilai>=90 && nilai<=100) {
    predikat = "A";
    
} else if (nilai>=80 && nilai<=89){
    predikat = "B";
    
} else if (nilai>=70 && nilai<=79){
    predikat = "C";
    
} else if (nilai>=60 && nilai<=69){
    predikat = "D";
    
} else if (nilai>=0 && nilai<=59){
    predikat = "E";
    
} else {
    System.out.println("Nilai Tidak Valid");
}
  break;
  case 'D':
  if (nilai>=90 && nilai<=100) {
    predikat = "A";
    
} else if (nilai>=80 && nilai<=89){
    predikat = "B";
    
} else if (nilai>=70 && nilai<=79){
    predikat = "C";
    
} else if (nilai>=60 && nilai<=69){
    predikat = "D";
    
} else if (nilai>=0 && nilai<=59){
    predikat = "E";
    
} else {
    System.out.println("Nilai Tidak Valid");
}
  break;
  default:
  System.out.println("Masukkan kelas anda A - D");
}
System.out.println();
System.out.println("=== HASIL UJIAN ===");
System.out.println("NAMA\t\t: "+ nama +"\nKELAS 12\t: "+ kelas +"\nNILAI\t\t: "+ nilai +"\nPREDIKAT\t: "+ predikat );
  
 }
}
