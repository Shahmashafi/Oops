import java.util.Arrays;
import java.util.Scanner;
class Binarysearch
{
  public static int binarysearch(int arr[],int search)
  {
    int left=0,right=arr.length-1,mid;
    while(left <= right)
    {
      mid=left+(right)/2;
       if(arr[mid] == search)
       {
         return mid;
       }
        if(arr[mid] < search)
       {
         left = mid +1;
       }
       else
       {
        right=mid-1;
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
   Arrays.sort(arr);
   System.out.println("Sorted array:"+ Arrays.toString(arr));
   int index = binarysearch(arr,search);
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
