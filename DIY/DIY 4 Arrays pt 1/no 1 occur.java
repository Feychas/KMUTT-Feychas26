import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner yy = new Scanner(System.in);
        
        int tot = yy.nextInt();
        int[] num = new int[tot];

      //buat input number to array
        for (int i = 0 ; i < tot ; i++) {
            num[i] = yy.nextInt();  //ex : 4, 2, 5, 1, 3
        } 
        
        for (int i = 0 ; i < tot - 1 ; i++) { //kenapa tot-1 soalnya last number gaperlu di cek, tapi kalau tot doang jg gpp
            int minel = i; //minel means index start 0 (krn i)
            for (int j = i + 1 ; j < tot ; j++) { //compare all to i (start from i + 1 - end/last index)
                if (num[j] < num[minel]) { //kalau ada yang lebih kecil dari minel 
                    minel = j; //langsung diganti/tuker
                }  //minel is basically i tp biar ga berubah valuenya jadi kita buat var baru
            }
          //ex using first loop
        int temp = num[i]; //nyimpen yg mau dituker jadi int biar ga keganti". ex = 4
        num[i] = num[minel]; //ex first loop : num[0] = num[3] means 4 = 1, 4 jadi 1
        num[minel] = temp; //pindah si 1 (num[4]) dan 4 (num[0]) tuker tempat
        }
    //code for print descending
    for (int i = tot - 1 ; i >= 0 ; i--) {
        System.out.print(num[i] + " ");
    }
      
    }
}
