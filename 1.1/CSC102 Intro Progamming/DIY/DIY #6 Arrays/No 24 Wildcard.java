import java.util.Scanner;
public class Wildbro {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //intinya semua hrs match, * bisa consume 0-infinity chr
        String s = x.nextLine();
        String p = x.nextLine();
        char[] str = s.toCharArray();
        char[] pat = p.toCharArray();
        int i = 0; //pointer s
        int j = 0; //pointer p
        int star = -1; //simpan last * in pattern (-1 krn blm exist)
        int match = 0; //how many chr d s yg eaten by *

        while (i < str.length) {
            if (j < pat.length && (pat[j] == '?' || pat[j] == str[i])) {
                i++; j++;
            } else if (j < pat.length && pat[j] == '*') {
                star = j++;
                match = i;
            } else if (star != -1) {
                j = star + 1;
                i = ++match;
            } else {
                System.out.println("false");
                return;
            }
        }

        while (j < pat.length && pat[j] == '*') j++; {
        System.out.print(j == pat.length ? "true" : "false");
         }
    }
}

/* SHORTEN VERSION
import java.util.*;

public class Wildbro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray(), p = sc.nextLine().toCharArray();
        int i = 0, j = 0, star = -1, match = 0;

        while (i < s.length) {
            if (j < p.length && (p[j] == '?' || p[j] == s[i])) { i++; j++; }
            else if (j < p.length && p[j] == '*') { star = j++; match = i; }
            else if (star != -1) { j = star + 1; i = ++match; }
            else { System.out.print("false"); return; }
        }

        while (j < p.length && p[j] == '*') j++;
        System.out.print(j == p.length);
    }
}
*/
