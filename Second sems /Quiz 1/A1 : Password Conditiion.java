import java.util.*;

public class PassCheck {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String inp = s.next();
      System.out.print(isValid(inp));
  }

public static boolean isValid(String pass) {
  if (pass.length() < 8 || pass.length() > 15) {
    return false;
  }

  boolean hasDigit = false;
  boolean hasLow = false;
  boolean hasUp = false;
  boolean hasSpecial = false;

  String specialChars = "@#%&!$*";

  for (int i = 0 ; i < pass.length() ; i++) {
    char ch = pass.charAt(i);

    if (Character.isDigit(ch)) {
      hasDigit = true;
    }
    if (Character.isLowerCase(ch)) {
      hasLow = true;
    }
    if (Character.isUpperCase(ch)) {
      hasUp = true;
    }
    if (specialChars.indexOf(ch) != -1) { //this how to check special char. -1 means found
      hasSpecial = true;
    }
  }

  return hasDigit && hasLow && hasUp && hasSpecial;
  }
}
