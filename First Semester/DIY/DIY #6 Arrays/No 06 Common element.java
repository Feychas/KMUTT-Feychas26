import java.util.Scanner;
import java.util.ArrayList;
public class Ribet {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        //perhatiin input potition sesuai user mau ya
        int n1 = x.nextInt(); 
        int[] a1 = new int[n1];
        for (int i = 0 ; i < n1 ; i++) {
            a1[i] = x.nextInt();
        }
        
        int n2 = x.nextInt(); 
        int[] a2 = new int[n2];
        for (int i = 0 ; i < n2 ; i++) {
            a2[i] = x.nextInt();
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        //batas input
        
        for (int i = 0 ; i < n1 ; i++) {
            for (int j = 0 ; j < n2 ; j++) {
                if (a1[i] == a2[j]) { //+  && !res.contains(a1[i]) kalau mau make sure gada yg double same
                    res.add(a1[i]);
                    break; //biar ga double check
                    //alr found match for a1[i], no need keep cek the rest of a2 for same a1[i]
                     }
                }
            }
            
        if (res.size() == 0) { //jgn lupa kalau alist pakai size()
            System.out.print("No common elements");
        } else {
            for (int i : res) {
                System.out.print(i + " ");
            } //itu for-each loop (for print)
        } /*long codenya :
        for (int i = 0 ; i < res.size() ; i++) {
             print(res.get(i) + " "); }*/
        
        }
    }
