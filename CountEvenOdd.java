import java.util.Scanner;
class CountEvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+ n + " elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int countEvent = 0; 
        int countOdd = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2 == 0)
            {
                countEvent++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Event numbers :"+ countEvent);
        System.out.println("Odd numbers :"+ countOdd);
    }
}