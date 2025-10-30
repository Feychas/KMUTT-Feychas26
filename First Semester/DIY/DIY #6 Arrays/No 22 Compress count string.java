import java.util.Scanner;
public class Hitung {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String inp = x.nextLine();
        String com = ""; //save compressed string
        int p = 0; //pointer
        
        while (p < inp.length()) {
            char ch = inp.charAt(p); //current ch yg dicek
            int c = 0;
            
            while (p < inp.length() && inp.charAt(p) == ch) { //count n loop sampai huruf yg sama habis
                  //state ulang p < length biar kalau string dah mentok ga eror outofbond
                c++;
                p++;
            }
          com += "" + ch + c;  //compress all to text
          //"" biar ga dianggep ASCII
        }
        
        System.out.print(inp.length() > com.length() ? com : inp);
    }
}
