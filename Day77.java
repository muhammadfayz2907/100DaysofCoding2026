public class day77 {
public static void main(String[] args) {

String teks = "Jawa Dan Sulawesi Sahabat";
String teks2 = "jawa dan sulawesi sahabat";

System.out.println("Teks asli\t\t\t: " + teks);
System.out.println("Jumlah karakter\t\t: " + teks.length());
System.out.println("Huruf besar\t\t\t: " + teks.toUpperCase());
System.out.println("Huruf kecil\t\t\t: " + teks.toLowerCase());
System.out.println("Huruf indeks ke-2\t: " + teks.charAt(2));
System.out.println("Substring\t\t\t: " + teks.substring(0, 17));
System.out.println("Ada kata Jawa?\t\t: " + teks.contains("Jawa"));
System.out.println("Ada kata Sulawesi?\t: " + teks.contains("Sulawesi"));
System.out.println("equals\t\t\t\t: " + teks.equals(teks2));
System.out.println("Ignore case\t\t\t: " + teks.equalsIgnoreCase(teks2));
System.out.println("Replace\t\t\t\t: "
+ teks.replace("Jawa", "Kalimantan"));
System.out.println("Posisi Sulawesi\t\t: " + teks.indexOf("Sulawesi"));
System.out.println("Dimulai dengan Jawa?\t : "
+ teks.startsWith("Jawa"));
System.out.println("Diakhiri dengan Sulawesi?: "
+ teks.endsWith("Sulawesi"));
String tambahan = " Best Friend ";
System.out.println("Concat\t\t\t\t: "
+ teks.concat(tambahan));
}
}
