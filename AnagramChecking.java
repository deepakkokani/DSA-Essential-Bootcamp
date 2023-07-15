import java.util.*;

class AnagramChecking 
{
  public static boolean areAnagrams(String s1, String s2) 
  {
    if (s1.length() == s2.length()) 
    {
      s1 = s1.toLowerCase();
      s2 = s2.toLowerCase();
      System.out.println("s1 String after converting to lowercase : "+s1);
      System.out.println("s2 String after converting to lowercase : "+s2);
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      return Arrays.equals(charArray1, charArray2);
    }
    return false;
  }

  public static boolean input() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String 1: ");
    String s1 = sc.next();
    System.out.print("Enter String 2: ");
    String s2 = sc.next();

    boolean result = areAnagrams(s1, s2);
    return result;
  }

  public static void main(String args[]) 
  {
    boolean isAnagram = input();
    System.out.println(isAnagram);
  }
}
