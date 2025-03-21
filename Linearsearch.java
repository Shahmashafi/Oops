import java.util.Arrays;
import java.util.Scanner;
class Linearsearch
{
  public static int Linearsearch(int arr[],int search)
  {
    int i;
    for(i=0;i<arr.length;i++)
    {
       if(arr[i] == search)
       {
         return i;
       }
    }   
       return -1;
  }
  public static void main(String args[])
  {
    int n,i,search;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter " + n +" numbers:");
    for(i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Enter the element to search:");
   search = sc.nextInt();
   int index = Linearsearch(arr,search);
   if(index == -1)
   {
    System.out.println("Element is not found");
  }
  else
  {
    System.out.println("Element is found at:"+ index);
  }
 }
} 
