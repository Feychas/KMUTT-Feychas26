import java.util.Scanner;
public class Pangrom {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //add .replaceAll("[^a-z]" , ""); remove anything not letter (a to z) - spaces etc
        String inp = x.nextLine().toLowerCase();
        //buat taruh a-z
        boolean[] seen = new boolean[26]; //isinya bakal false all
        //all values are false, meaning we haven’t “seen” any letters yet.
        
        for (int i = 0 ; i < inp.length() ; i++) {
            char ch = inp.charAt(i); //get inp chr
            //ASCII math trick
            if (ch >= 'a' && ch <= 'z') { //if ch is a-z
                seen[ch - 'a'] = true; //kalau found berarti jd true
                //knp -a? karena ASCII number, dikurang a buat balikin ke index asal (012...)
            }
        }
        
        boolean isPang = true; //assume is pangram
        for (boolean b : seen) { //check every chr b d seen, kaya if i loop
            if (!b) { //kalau ada seen yang false (means that chr not found cuz still false)
                isPang = false;
                break; //sekali nemu lsg done it's false
            }
        }
        
        System.out.print(isPang ? "Pangram" : "Not Pangram");
        
        
    }
}
