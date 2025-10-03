import java.util.Scanner;
public class TimeTravel {
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        
        int h = qq.nextInt(); //inp hour
        int m = qq.nextInt(); //inp mins
        String t = qq.next(); //inp am/pm
        
        if (t.equalsIgnoreCase("am")) { //kalau am yg perlu d ganti cmn 12
            if (h == 12) { //special condition 12 am
                h = 0;
            }
        } else { //alias kalau pm
            if (h != 12) { //karena kalau 12 pm ya ttp 12 
                h += 12; //ya itungnya emg gt
            }
        }
        System.out.printf("%02d:%02d", h, m); //sistem printf
        //format, ("format", var);
        //% placeholder buat nilai yg digantikan (krn kt pny 2 variabel, 1 for each)
        //d for angka decimals
        //2 is jumlah angka
        //0 biar kalau shorter than format, print 0
        //: the string krn termasuk format yg kt mau
    }
    }
