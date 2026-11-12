import java.util.Scanner;

class Traversing 
{
    public static void main(String args[])
    {
        int []nums = {1,2,3,4,5};
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        int []arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        // enhanced for loop
        for(int val : nums)
        {
            System.out.println(val);
        }
        // input by user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        int []arr1 = new int[n];
        System.out.println("Enter "+ n +" elements :");
        for(int i=0; i<n; i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("Array Traversed like: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr1[i]);
        }
        s.close();
    }
}