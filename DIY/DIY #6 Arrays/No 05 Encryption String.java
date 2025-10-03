import java.util.Scanner;

public class  Strok {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();
        x.nextLine(); //remove leftover line
        String[] words = x.nextLine().split(" "); //split to arr/word

        for (int i = 0; i < words.length ; i++) { //cek each chr
            String lower = ""; //storing
            String upper = "";
            String word = words[i]; //cek per word/pointer

            for (int j = 0; j < word.length() ; j++) {
                //if j odd lower, if j even upper
                char c = (j % 2 == 0) ? Character.toUpperCase(word.charAt(j)) : Character.toLowerCase(word.charAt(j));
                if (Character.isLowerCase(c)) lower += c;//simpan ke lower
                else upper += c; //simpan ke upper
            }

            System.out.print(lower + upper);
            if (i != words.length - 1) System.out.print(" "); //print spc kalau bkn last word
        }
    }
}
