import java.util.Scanner;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n +" elemetns :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter your target element :");
        int num = sc.nextInt();
        int idx=-1;
        int i=0;
        for(i=0; i<n; i++)
        {
            if(arr[i] == num)
            {
                idx = i;
                break;
            }
        }
        if(idx==-1)
        {
            System.out.println("Your element is not found");
        }
        else{
            System.out.println("Your elements is found at position "+ (idx+1));
        }
        sc.close();
    }
}