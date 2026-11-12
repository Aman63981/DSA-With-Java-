import java.util.Scanner;
class Reverse
{
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();    
        }
        System.out.println("Initail array :");
        for(int val : arr)
        {
            System.out.print(val +"  ");
        }
        int temp, stIdx, endIdx;
        stIdx = 0; 
        endIdx = arr.length-1;
        while(stIdx< endIdx)
        {
            temp = arr[stIdx];
            arr[stIdx] = arr[endIdx];
            arr[endIdx] = temp;
            stIdx++;
            endIdx--;
        }
        System.out.println("\nReverse array : ");
        for(int val : arr)
        {
            System.out.print(val +"  ");
        }
    }
}