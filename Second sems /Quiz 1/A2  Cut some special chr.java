import java.util.*;

public class CutSeru {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      String inp = s.nextLine();
      System.out.print(inp.replaceAll("([?!])\\1+", "$ss1"));
      

  }
}