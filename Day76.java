public class Day76 {
     public static void main(String[] args) {
         String teks = " Jawa adalah kunci ";
         String hasilTrim = teks.trim();
         String hasilreplace = hasilTrim.replace("Jawa", "Sulawesi");
         String hasilsubstring = hasilreplace.substring(0, 8);

         System.out.println("Teks awal: [" + teks + "]\nSetelah trim: [" + teks + "]\nSetelah replace: " + hasilreplace + "\nSetelah substring: " + hasilsubstring);
         
     }
}
