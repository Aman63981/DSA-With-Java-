class CheckSortedArray
{
    public int check(int[]arr, int idx)
    {
        if(arr.length==1 || idx<=1)
        {
            return 1;
        }
        if(arr[idx-1]<arr[idx-2])
        {
            return 0;
        }
        return check(arr, idx-1);
    }
    public static void main(String args[])
    {
        CheckSortedArray obj = new CheckSortedArray();
        int res = obj.check(new int[] {1,22,3}, 3);
        if(res==1)
        {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}



// class CheckSortedArray
// {
//     public int isArraySortedOrder(int []A, int idx)
//     {
//         if(A.length==1 || idx==1)
//         {
//             return 1;
//         }
//         if(A[idx-1]<A[idx-2])
//         {
//             return 0;
//         }
//         return isArraySortedOrder(A, idx-1);
//     }
//     public static void main(String args[])
//     {
//         CheckSortedArray obj = new CheckSortedArray();
//         int result = obj.isArraySortedOrder(new int[]{1,2,3,4,5,6,7}, 3);
//         if(result==1)
//         {
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }
//     }
// }