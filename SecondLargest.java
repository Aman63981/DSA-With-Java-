import java.util.Scanner;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n +" elements :");
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max1, max2;
        if(arr[0]> arr[1])
        {
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[1];
            max2 = arr[0];
        }
        for(int i=2; i<n; i++)
        {
            if(max1<arr[i])
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(max2 < arr[i])
            {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest number is "+ max2);
        sc.close();
    }
}