import java.util.*;

public class Rotation
{
  public static void OriginalArray()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of the array : ");
    int size = sc.nextInt();
    int a[] = new int[size];
    //read array
    System.out.println("Enter elements in the array : ");
    for(int i=0;i<a.length;i++)
    {
      a[i] = sc.nextInt();
    }
    //write array
    System.out.print("Original Array : ");
    System.out.print("[");
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+ ",");
    }
    System.out.println("]");
    System.out.println();
    ArrayAfterRightRotation(a);
  }
  
  public static void ArrayAfterRightRotation(int a[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rotation Count: ");
    int RotationCount = sc.nextInt();
    for(int i = 0; i < RotationCount; i++)
    {  
      int j, last;  
      last = a[a.length-1];  
      for(j = a.length-1; j > 0; j--)
      {  
        a[j] = a[j-1];  
      }  
      a[0] = last;  
    }  
    System.out.println();  
    System.out.print("Array after right rotation: "); 
    System.out.print("[");    
    for(int i = 0; i< a.length; i++)
    {  
      System.out.print(a[i] + ",");  
    } 
    System.out.print("]");   
    System.out.println();    
  }
  
  public static void main(String args[])
  {
    OriginalArray();
  }
}