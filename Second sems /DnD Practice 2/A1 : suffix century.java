import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		int cent = (year-1) / 100 + 1; //rumus year to century 
		
		String suff = ""; //dont forget to inialize
		int lastwo = cent % 100; 
    //in case there's more than 2 nums century we only see the last 2
		
		if (lastwo >= 11 && lastwo <= 13) {
      suff = "th"; //cuz khusus 11-13 suffix is th
		} else {
		    switch (cent % 10) {
		        case 1 : suff = "st";
		        break;
		        case 2 : suff = "nd";
		        break;
		        case 3 : suff = "rd";
		        break;
		        default : suff = "th";
		    }
		}
		
		System.out.println(cent + suff);
	}
}
