import java.util.Scanner;

class AddBeg
{
    public static void main(String args[])
    {
        final int MAX = 10;
        int arr[]=new int[MAX], n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array while array capacity "+ MAX+" : ");
        n = s.nextInt();
        System.out.println("Enter "+ n + " elements : ");
        for(i=0; i<n; i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Your array is : ");
        for(i=0; i<n; i++)
        {
            System.out.print("  "+ arr[i]);
        }
        if(n>=MAX)
        {
            System.out.println("\nYour array size is full so not insert ");
            return;
        }
        else{
            n++;
        }
        System.out.println("\nEnter new elements : ");
        int newEl=s.nextInt();
        for(i=n-1; i>0; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0] = newEl;
        System.out.println("Your array is :");
        for(i=0; i<n; i++)
        {
            System.out.print("  "+ arr[i]);
        }
        s.close();
    }
}