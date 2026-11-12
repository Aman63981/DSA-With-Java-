import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+ n+" elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum+= arr[i];
        }
        System.out.println("Sum is"+ sum);
        s.close();
    }
}
